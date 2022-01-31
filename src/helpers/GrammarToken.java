package helpers;

import java.util.regex.Pattern;

public class GrammarToken {
    public String name;
    public String pattern;
    public boolean skip;

    @Override
    public String toString() {
        return "GrammarToken{" +
                "name='" + name + '\'' +
                ", pattern='" + pattern + '\'' +
                ", skip=" + skip +
                '}';
    }

    public GrammarToken(String name, String pattern, boolean skip) {
        this.name = name;
        this.pattern = pattern;
        this.skip = skip;
    }
}
