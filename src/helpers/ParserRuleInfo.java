package helpers;

import java.util.ArrayList;
import java.util.List;

public class ParserRuleInfo {
    public static class RuleAndCode {
        public boolean token;
        public String name;
        public String args;
        public String code;

        public RuleAndCode(String name, String args, String code, boolean token) {
            this.name = name;
            this.args = args;
            if (code.length() > 0) {
                code = code.substring(1, code.length() - 1);
            }
            this.code = code;
            this.token = token;
        }

        @Override
        public String toString() {
            return "RuleAndCode{" +
                    "token=" + token +
                    ", name='" + name + '\'' +
                    ", args='" + args + '\'' +
                    ", code='" + code + '\'' +
                    '}';
        }
    }

    public static class AlternativeRule {
        public List<RuleAndCode> parts;

        @Override
        public String toString() {
            return "AlternativeRule{" +
                    "parts=" + parts +
                    '}';
        }

        public AlternativeRule() {
            this.parts = new ArrayList<>();
        }
    }

    @Override
    public String toString() {
        return "ParserRuleInfo{" +
                "name='" + name + '\'' +
                ", args='" + args + '\'' +
                ", returnValue='" + returnValue + '\'' +
                ", alternatives=" + alternatives +
                '}';
    }

    public String name;
    public String args;
    public String returnValue;
    public List<AlternativeRule> alternatives;

    public ParserRuleInfo(String name, String args, String returnValue, List<AlternativeRule> alternatives) {
        this.name = name;
        this.args = args;
        this.returnValue = returnValue;
        this.alternatives = alternatives;
    }
}
