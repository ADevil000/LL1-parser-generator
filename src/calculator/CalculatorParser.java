package calculator;

// import

public class CalculatorParser {
    public CalculatorLexer lexer;

    public CalculatorParser(CalculatorLexer lexer) throws Exception {
        this.lexer = lexer;
        lexer.nextToken();
    }

    public void assertToken(Token.TokenType type) throws Exception {
        if (type != lexer.curToken().type) {
            throw new Exception("Wrong token type: wait - " + type + "has - " + lexer.curToken().type);
        }
        lexer.nextToken();
    }

    public Nstart start() throws Exception {
        Nstart node = new Nstart("start");
        switch (lexer.curToken().type) {
            case NUMBER, LBRACKET -> {
                Ne e0 = e();
                node.addChild(e0);
                 node.val = e0.val; 

            }

            default -> throw new Exception("Wrong Token: " + lexer.curToken() + " end pos=" + lexer.pos);
        }
        return node;
    }
    public Ne e() throws Exception {
        Ne node = new Ne("e");
        switch (lexer.curToken().type) {
            case NUMBER, LBRACKET -> {
                Nt t0 = t();
                node.addChild(t0);
                
                Na a1 = a(t0.val);
                node.addChild(a1);
                node.val = a1.val;

            }

            default -> throw new Exception("Wrong Token: " + lexer.curToken() + " end pos=" + lexer.pos);
        }
        return node;
    }
    public Na a(int acc) throws Exception {
        Na node = new Na("a");
        switch (lexer.curToken().type) {
            case PLUS -> {
                Node PLUS0 = new Node(lexer.curToken().data);
                assertToken(lexer.curToken().type);
                node.addChild(PLUS0);
                
                Nt t1 = t();
                node.addChild(t1);
                acc = acc + t1.val;
                Na a2 = a(acc);
                node.addChild(a2);
                node.val = a2.val;

            }
            case MINUS -> {
                Node MINUS0 = new Node(lexer.curToken().data);
                assertToken(lexer.curToken().type);
                node.addChild(MINUS0);
                
                Nt t1 = t();
                node.addChild(t1);
                acc = acc - t1.val;
                Na a2 = a(acc);
                node.addChild(a2);
                node.val = a2.val;

            }
            case END, RBRACKET -> {
                node.addChild(new Node("EPS"));
                node.val = acc;
            }

            default -> throw new Exception("Wrong Token: " + lexer.curToken() + " end pos=" + lexer.pos);
        }
        return node;
    }
    public Nt t() throws Exception {
        Nt node = new Nt("t");
        switch (lexer.curToken().type) {
            case NUMBER, LBRACKET -> {
                Nv v0 = v();
                node.addChild(v0);
                
                Nf f1 = f(v0.val);
                node.addChild(f1);
                node.val = f1.val;

            }

            default -> throw new Exception("Wrong Token: " + lexer.curToken() + " end pos=" + lexer.pos);
        }
        return node;
    }
    public Nf f(int acc) throws Exception {
        Nf node = new Nf("f");
        switch (lexer.curToken().type) {
            case MUL -> {
                Node MUL0 = new Node(lexer.curToken().data);
                assertToken(lexer.curToken().type);
                node.addChild(MUL0);
                
                Nv v1 = v();
                node.addChild(v1);
                acc = acc * v1.val;
                Nf f2 = f(acc);
                node.addChild(f2);
                node.val = f2.val;

            }
            case DIV -> {
                Node DIV0 = new Node(lexer.curToken().data);
                assertToken(lexer.curToken().type);
                node.addChild(DIV0);
                
                Nv v1 = v();
                node.addChild(v1);
                acc = acc / v1.val;
                Nf f2 = f(acc);
                node.addChild(f2);
                node.val = f2.val;

            }
            case END, RBRACKET, PLUS, MINUS -> {
                node.addChild(new Node("EPS"));
                node.val = acc;
            }

            default -> throw new Exception("Wrong Token: " + lexer.curToken() + " end pos=" + lexer.pos);
        }
        return node;
    }
    public Nv v() throws Exception {
        Nv node = new Nv("v");
        switch (lexer.curToken().type) {
            case NUMBER -> {
                Node NUMBER0 = new Node(lexer.curToken().data);
                assertToken(lexer.curToken().type);
                node.addChild(NUMBER0);
                node.val = Integer.parseInt(NUMBER0.value);

            }
            case LBRACKET -> {
                Node LBRACKET0 = new Node(lexer.curToken().data);
                assertToken(lexer.curToken().type);
                node.addChild(LBRACKET0);
                
                Ne e1 = e();
                node.addChild(e1);
                
                Node RBRACKET2 = new Node(lexer.curToken().data);
                assertToken(lexer.curToken().type);
                node.addChild(RBRACKET2);
                node.val = e1.val;

            }

            default -> throw new Exception("Wrong Token: " + lexer.curToken() + " end pos=" + lexer.pos);
        }
        return node;
    }


    public static class Nstart extends Node {
        public int val;

        public Nstart(String value) {
            super(value);
        }
    }


    public static class Ne extends Node {
        public int val;

        public Ne(String value) {
            super(value);
        }
    }


    public static class Na extends Node {
        public int val;

        public Na(String value) {
            super(value);
        }
    }


    public static class Nt extends Node {
        public int val;

        public Nt(String value) {
            super(value);
        }
    }


    public static class Nf extends Node {
        public int val;

        public Nf(String value) {
            super(value);
        }
    }


    public static class Nv extends Node {
        public int val;

        public Nv(String value) {
            super(value);
        }
    }


}
