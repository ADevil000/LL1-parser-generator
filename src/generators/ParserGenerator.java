package generators;

import helpers.ParserRuleInfo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class ParserGenerator {
    public List<ParserRuleInfo> rules;
    public String parserName;
    public String lexerName;
    public String path;
    public HashMap<String, HashSet<String>> firsts = new HashMap<>();
    public HashMap<String, HashSet<String>> follows = new HashMap<>();

    public ParserGenerator(String path, String name, List<ParserRuleInfo> rules) throws Exception {
        this.path = path;
        this.rules = rules;
        this.parserName = name + "Parser";
        this.lexerName = name + "Lexer";
        checkFirstAndFollow();
    }

    public void checkFirstAndFollow() throws Exception {
        for (ParserRuleInfo ri : rules) {
            firsts.put(ri.name, new HashSet<>());
        }
        boolean changed = true;
        while (changed) {
            changed = false;
            for (ParserRuleInfo ri : rules) {
                HashSet<String> set = firsts.get(ri.name);
                int was = set.size();
                for (ParserRuleInfo.AlternativeRule alt : ri.alternatives) {
                    if (alt.parts.get(0).token) { // EPS здесь
                        set.add(alt.parts.get(0).name);
                    } else {
                        set.addAll(firsts.get(alt.parts.get(0).name));
                    }
                }
                if (was < set.size()) {
                    changed = true;
                }
            }
        }

        for (ParserRuleInfo ri : rules) {
            follows.put(ri.name, new HashSet<>());
        }
        follows.get(rules.get(0).name).add("END");
        changed = true;
        while (changed) {
            changed = false;
            for (ParserRuleInfo ri : rules) {
                for (ParserRuleInfo.AlternativeRule alt : ri.alternatives) {
                    for (int i = 0; i < alt.parts.size(); i++) {
                        ParserRuleInfo.RuleAndCode rc = alt.parts.get(i);
                        if (rc.token) continue;
                        HashSet<String> setRc = follows.get(rc.name);
                        int was = setRc.size();
                        if (i < alt.parts.size() - 1) {
                            ParserRuleInfo.RuleAndCode rcNext = alt.parts.get(i + 1);
                            if (rcNext.token) {
                                if (!rcNext.name.equals("EPS")) {
                                    setRc.add(rcNext.name);
                                } else {
                                    setRc.addAll(follows.get(ri.name));
                                }
                            } else {
                                HashSet<String> setRcNext = firsts.get(rcNext.name);
                                boolean wasEps = setRcNext.remove("EPS");
                                setRc.addAll(setRcNext);
                                if (wasEps) {
                                    setRcNext.add("EPS");
                                    setRc.addAll(follows.get(ri.name));
                                }
                            }
                        } else {
                            setRc.addAll(follows.get(ri.name));
                        }
                        if (was < setRc.size()) {
                            changed = true;
                        }
                    }
                }
            }
        }
        for (ParserRuleInfo ri : rules) {
            HashSet<String> followA = follows.get(ri.name);
            for (int i = 0; i < ri.alternatives.size() - 1; i++) {
                ParserRuleInfo.RuleAndCode x = ri.alternatives.get(i).parts.get(0);
                Set<String> xFirst;
                if (x.token) {
                    xFirst = Set.of(x.name);
                } else {
                    xFirst = firsts.get(x.name);
                }
                for (int j = i + 1; j < ri.alternatives.size(); j++) {
                    ParserRuleInfo.RuleAndCode y = ri.alternatives.get(j).parts.get(0);
                    Set<String> yFirst;
                    if (y.token) {
                        yFirst = Set.of(y.name);
                    } else {
                        yFirst = firsts.get(y.name);
                    }
                    for (String el : xFirst) {
                        if (el.equals("EPS")) {
                            for (String el2 : yFirst) {
                                if (followA.contains(el2)) {
                                    throw new Exception("NOT LL1");
                                }
                            }
                        }
                        if (yFirst.contains(el)) {
                            throw new Exception("NOT LL1");
                        }
                    }
                }
            }
        }
    }

    public void generate(String packageName) throws Exception {
        checkFirstAndFollow();
        createNodeStructure(packageName);
        createParser(packageName);
    }

    public void createParser(String packageName) throws IOException {
        String nodes = nodeInstances();
        StringBuilder methods = new StringBuilder();
        for (ParserRuleInfo ri : rules) {
            StringBuilder cases = new StringBuilder();
            boolean needFollow = false;
            String codeForFollow = "";
            for (ParserRuleInfo.AlternativeRule alt : ri.alternatives) {
                String first = "";
                ParserRuleInfo.RuleAndCode tmp = alt.parts.get(0);
                // first
                if (!tmp.token) {
                    Set<String> set = firsts.get(tmp.name);
                    boolean wasEps = set.remove("EPS");
                    first = String.join(", ", set);
                    if (wasEps) {
                        set.add("EPS");
                        needFollow = wasEps;
                        // Надеюсь код нужен, только при истинном EPS, а не из follow
                    }
                } else {
                    if (tmp.name.equals("EPS")) {
                        needFollow = true;
                        codeForFollow = tmp.code;
                        continue;
                    } else {
                        first = tmp.name;
                    }
                }
                // cases
                StringBuilder code = new StringBuilder();
                int numberOfPart = 0;
                for (ParserRuleInfo.RuleAndCode rc : alt.parts) {
                    if (rc.token) {
                        code.append(String.format("""
                                                        Node %s%d = new Node(lexer.curToken().data);
                                                        assertToken(lexer.curToken().type);
                                                        node.addChild(%s%d);
                                                        %s
                                        """,
                                rc.name,
                                numberOfPart,
                                rc.name,
                                numberOfPart,
                                rc.code));
                    } else {
                        code.append(String.format("""
                                                        N%s %s%d = %s(%s);
                                                        node.addChild(%s%d);
                                                        %s
                                        """,
                                rc.name,
                                rc.name,
                                numberOfPart,
                                rc.name,
                                rc.args,
                                rc.name,
                                numberOfPart,
                                rc.code.toString()));
                    }
                    numberOfPart++;
                }
                cases.append(String.format("""
                                            case %s -> {
                                %s
                                            }
                                """,
                        first,
                        code.toString().replaceAll("\\$", "node.")
                ));
            }
            if (needFollow) {
                String caseFollow = String.join(", ", follows.get(ri.name));
                cases.append(String.format("""
                                    case %s -> {
                                        node.addChild(new Node("EPS"));
                                        %s
                                    }
                        """,
                        caseFollow,
                        codeForFollow.replace("$", "node.")));
            }
            String method = String.format("""
                        public N%s %s(%s) throws Exception {
                            N%s node = new N%s("%s");
                            switch (lexer.curToken().type) {
                    %s
                                default -> throw new Exception("Wrong Token: " + lexer.curToken() + " end pos=" + lexer.pos);
                            }
                            return node;
                        }
                    """,
                    ri.name,
                    ri.name,
                    ri.args.replaceAll("=", " "),
                    ri.name,
                    ri.name,
                    ri.name,
                    cases.toString()
                    );
            methods.append(method);
        }
        String parser = String.format("""
                package %s;

                // import

                public class %s {
                    public %s lexer;

                    public %s(%s lexer) throws Exception {
                        this.lexer = lexer;
                        lexer.nextToken();
                    }
                    
                    public void assertToken(Token.TokenType type) throws Exception {
                        if (type != lexer.curToken().type) {
                            throw new Exception("Wrong token type: wait - " + type + "has - " + lexer.curToken().type);
                        }
                        lexer.nextToken();
                    }
                    
                %s

                %s
                }
                """,
                packageName,
                parserName,
                lexerName,
                parserName,
                lexerName,
                methods.toString(),
                nodes
                );
        Path outPath = Path.of(path + "/" + packageName + "/" + parserName + ".java");
        if (Files.notExists(outPath.getParent())) {
            Files.createDirectories(outPath.getParent());
        }
        try (BufferedWriter out = Files.newBufferedWriter(outPath)) {
            out.write(parser);
        }
    }

    public void createNodeStructure(String packageName) throws IOException {
        String node = String.format("""
                        package %s;
                                        
                        import java.util.ArrayList;
                        import java.util.List;
                                        
                        public class Node {
                            public static int label = 1;
                            public String value;
                            public List<Node> children = new ArrayList<>();

                            public Node(String value) {
                                this.value = value;
                            }

                            public void addChild(Node child) {
                                children.add(child);
                            }

                            public String toString(String align) {
                                String res = align + "Node: value=" + value + "\\n";
                                if (children.isEmpty()) {
                                    return res;
                                }
                                res += align + "Children: \\n";
                                for (Node child : children) {
                                    res += child.toString(align + "     ");
                                }
                                return res;
                            }

                            public String dotNumerate() {
                                String res = "" + label++ + " [label=\\"" + value + "\\"]\\n";
                                for (Node child : children) {
                                    res += child.dotNumerate();
                                }
                                return res;
                            }

                            @Override
                            public String toString() {
                                int num = label++;
                                String res = "";
                                for (Node child : children) {
                                    res += num + " -> " + label + "\\n";
                                    res += child.toString();
                                }
                                return res;
                            }
                        }""",
                packageName);
        Path outPath = Path.of(path + "/" + packageName + "/Node.java");
        if (Files.notExists(outPath.getParent())) {
            Files.createDirectories(outPath.getParent());
        }
        try (BufferedWriter out = Files.newBufferedWriter(outPath)) {
            out.write(node);
        }
    }

    public String nodeInstances() {
        String nodes = rules.stream().map(r -> String.format("""
                    public static class N%s extends Node {
                        %s
                        
                        public N%s(String value) {
                            super(value);
                        }
                    }

                """,
                r.name,
                r.returnValue.isEmpty() ? "" : Arrays.stream(r.returnValue.replaceAll("=", " ").split(";")).map(s -> "public " + s + ";").collect(Collectors.joining("\n")),
                r.name
                )).collect(Collectors.joining("\n"));
        return nodes;
    }
}
