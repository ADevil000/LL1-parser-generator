package helpers;

import java.util.List;

public class GrammarInfo {
    public String name;
    public List<GrammarToken> lexerInfo;
    public List<ParserRuleInfo> parserRuleInfoList;

    public GrammarInfo(String name, List<GrammarToken> lexerInfo, List<ParserRuleInfo> parserRuleInfoList) {
        this.name = name;
        this.lexerInfo = lexerInfo;
        this.parserRuleInfoList = parserRuleInfoList;
    }
}
