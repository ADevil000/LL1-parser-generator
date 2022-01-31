import grammar.MyGrammarLexer;
import grammar.MyGrammarParser;
import generators.LexerGenerator;
import generators.ParserGenerator;
import helpers.GrammarInfo;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName(args[0]);
        MyGrammarLexer lexer = new MyGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MyGrammarParser parser = new MyGrammarParser(tokens);
        GrammarInfo node = parser.grammarStructure().info;
        String path = args[1];
        LexerGenerator lexerGenerator = new LexerGenerator(path, node.name, node.lexerInfo);
        lexerGenerator.generate("calculator");
        ParserGenerator parserGenerator = new ParserGenerator(path, node.name, node.parserRuleInfoList);
        parserGenerator.generate("calculator");
    }
}