package calculator;

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
                ", data='" + data + '\'' +
                '}';
    }

    public enum TokenType {
        PLUS, MINUS, MUL, DIV, WS, NUMBER, LBRACKET, RBRACKET, END;
    }
}
