package calculator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculatorLexer {
    public String expression;
    public int pos = 0;
    public Token token;
    private Pattern ignore;
    private Matcher matcher;
    private final static Token END = new Token(Token.TokenType.END, "");
    LinkedHashMap<Token.TokenType, Pattern> patterns = new LinkedHashMap<>();

    public CalculatorLexer(String expr) {
        this.ignore = Pattern.compile("([ \t\r\n]+)");
        this.matcher = Pattern.compile("").matcher("");
        patterns.put(Token.TokenType.PLUS, Pattern.compile("\\+"));
        patterns.put(Token.TokenType.MINUS, Pattern.compile("-"));
        patterns.put(Token.TokenType.MUL, Pattern.compile("\\*"));
        patterns.put(Token.TokenType.DIV, Pattern.compile("/"));
        patterns.put(Token.TokenType.NUMBER, Pattern.compile("[1-9][0-9]*"));
        patterns.put(Token.TokenType.LBRACKET, Pattern.compile("\\("));
        patterns.put(Token.TokenType.RBRACKET, Pattern.compile("\\)"));
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
