package generators;

import helpers.GrammarToken;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class LexerGenerator {
    List<GrammarToken> tokens;
    String nameOfClass;
    String path;
    private static final String SEPARATOR = System.lineSeparator();

    public LexerGenerator(String path, String name, List<GrammarToken> tokens) {
        this.path = path;
        this.tokens = tokens;
        this.nameOfClass = name + "Lexer";
    }

    public void generate(String packageName) throws IOException {
        createTokenAndTokenType(packageName);
        createLexer(packageName);
    }

    void createTokenAndTokenType(String packageName) throws IOException {
        String tokenType = String.format("""
                        package %s;

                        public class Token {
                            public TokenType type;
                            public String data;

                            Token(TokenType type, String data) {
                                this.type = type;
                                this.data = data;
                            }
                            
                            @Override
                            public String toString() {
                                return "Token{" +
                                        "type=" + type +
                                        ", data='" + data + '\\'' +
                                        '}';
                            }

                            public enum TokenType {
                                %s
                            }
                        }
                        """,
                packageName,
                tokens.stream().map(t -> t.name).distinct().collect(Collectors.joining(", ")) + ", END;");
        Path outPath = Path.of(path + "/" + packageName + "/Token.java");
        if (Files.notExists(outPath.getParent())) {
            Files.createDirectories(outPath.getParent());
        }
        try (BufferedWriter out = Files.newBufferedWriter(outPath)) {
            out.write(tokenType);
        }
    }

    void createLexer(String packageName) throws IOException {
        String ignore = tokens.stream().filter(t -> t.skip).map(t -> "(" + t.pattern + ")").collect(Collectors.joining("|"));
        if (!ignore.isEmpty()) {
            ignore = "this.ignore = Pattern.compile(\"" + ignore + "\");";
        }
        String patterns = tokens.stream().filter(t -> !t.skip).map(t -> "        patterns.put(Token.TokenType." + t.name + ", Pattern.compile(\"" + t.pattern + "\"));").collect(Collectors.joining(SEPARATOR));
        String lexer = String.format("""
                    package %s;
                    
                    import java.util.LinkedHashMap;
                    import java.util.Map;
                    import java.util.regex.Matcher;
                    import java.util.regex.Pattern;

                    public class %s {
                        public String expression;
                        public int pos = 0;
                        public Token token;
                        private Pattern ignore;
                        private Matcher matcher;
                        private final static Token END = new Token(Token.TokenType.END, "");
                        LinkedHashMap<Token.TokenType, Pattern> patterns = new LinkedHashMap<>();
                        
                        public %s(String expr) {
                            %s
                            this.matcher = Pattern.compile("").matcher("");
                    %s
                            this.expression = expr;
                        }

                        public Token curToken() {
                            return token;
                        }

                        public void skip() {
                            if (ignore == null) return;
                            matcher.usePattern(ignore);
                            matcher.reset(expression);
                            while (matcher.lookingAt()) {
                                pos += matcher.end();
                                expression = expression.substring(matcher.end());
                                matcher.reset(expression);
                            }
                        }

                        public void nextToken() throws Exception {
                            skip();
                            for (Map.Entry<Token.TokenType, Pattern> entry : patterns.entrySet()) {
                                matcher.usePattern(entry.getValue());
                                matcher.reset(expression);
                                if (matcher.lookingAt()) {
                                    pos += matcher.end();
                                    Token res = new Token(entry.getKey(), expression.substring(0, matcher.end()));
                                    expression = expression.substring(matcher.end());
                                    matcher.reset(expression);
                                    token = res;
                                    return;
                                }
                            }
                            if (expression.isEmpty()) {
                                token = END;
                            } else {
                                throw new Exception("Undefined token start: " + expression); 
                            }
                        }
                    }
                    """,
                packageName,
                nameOfClass,
                nameOfClass,
                ignore,
                patterns
                );
        Path outPath = Path.of(path + "/" + packageName + "/" + nameOfClass + ".java");
        if (Files.notExists(outPath.getParent())) {
            Files.createDirectories(outPath.getParent());
        }
        try (BufferedWriter out = Files.newBufferedWriter(outPath)) {
            out.write(lexer);
        }
    }

}
