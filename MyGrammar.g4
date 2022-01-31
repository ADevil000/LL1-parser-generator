grammar MyGrammar;

@header {
import java.util.*;
import helpers.*;
}

grammarStructure returns[GrammarInfo info] :
	'grammar' grammarName ';' lexerRules parserRules EOF { $info = new GrammarInfo($grammarName.text, $lexerRules.list, $parserRules.list); };

grammarName : TOKEN_NAME | RULE_NAME;

lexerRules returns [List<GrammarToken> list] @init {
	List<GrammarToken> list = new ArrayList<>();
	$list = list;
}
	: 'lexer {' (token { $list.add($token.info); })* '}';

token returns [GrammarToken info]
	locals [boolean ignore = false;]
	: n=TOKEN_NAME ':' p=PATTERN ('-> ignore' {$ignore = true;})? ';' {$info = new GrammarToken($n.text, $p.text.replaceAll("\"", ""), $ignore);};

parserRules returns [List<ParserRuleInfo> list]
	locals [
			List<ParserRuleInfo.AlternativeRule> alts = new ArrayList<>(),
			String tmpArg = "",
			String tmpReturn = ""
			]
	@init {
		List<ParserRuleInfo> list = new ArrayList<>();
		$list = list;
	}
	: 'parser {' (RULE_NAME '(' (args {$tmpArg = $args.text;})? ')' '[' (returnVal {$tmpReturn = $returnVal.text;})? ']' ':' f=myRule {$alts.add($f.alt);} ('|' s=myRule {$alts.add($s.alt);})* ';' {list.add(new ParserRuleInfo($RULE_NAME.text, $tmpArg, $tmpReturn, $alts)); $alts = new ArrayList<>(); $tmpArg = ""; $tmpReturn = "";})+ '}';

args : arg (',' arg)*;

arg : type '=' RULE_NAME;

type : RULE_NAME | TOKEN_NAME;

returnVal : arg;

myRule returns [ParserRuleInfo.AlternativeRule alt]
	@init {
	ParserRuleInfo.AlternativeRule alt = new ParserRuleInfo.AlternativeRule();
	$alt = alt;
}
	: parts[$alt];

parts[ParserRuleInfo.AlternativeRule alt] : (part {$alt.parts.add($part.info);})+;

part returns [ParserRuleInfo.RuleAndCode info]
	locals [String codeLines = "",
	String tmpArgs = ""]
	: TOKEN_NAME (code { $codeLines = $code.text; })? { $info = new ParserRuleInfo.RuleAndCode($TOKEN_NAME.text, "", $codeLines, true); $codeLines = ""; $tmpArgs = "";}
	| RULE_NAME '('(inputArgs {$tmpArgs = $inputArgs.text;})?')' (code { $codeLines = $code.text; })? { $info = new ParserRuleInfo.RuleAndCode($RULE_NAME.text, $tmpArgs, $codeLines, false); $codeLines = ""; $tmpArgs = "";};

inputArgs : inputArg (',' inputArg)*;

inputArg :  inputArgName ('.' inputArgName)*;

inputArgName : RULE_NAME;

code : CODE;

RULE_NAME : [a-z][a-zA-Z0-9]*;

TOKEN_NAME : [A-Z][a-zA-Z0-9]*;

PATTERN : '"'.*?'"';

CODE : '{' .*? '}';

WS : [ \t\r\n]+ -> skip;