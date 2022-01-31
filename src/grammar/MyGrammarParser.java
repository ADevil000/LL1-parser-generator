// Generated from MyGrammar.g4 by ANTLR 4.9.2
package grammar;

import helpers.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, RULE_NAME=16, 
		TOKEN_NAME=17, PATTERN=18, CODE=19, WS=20;
	public static final int
		RULE_grammarStructure = 0, RULE_grammarName = 1, RULE_lexerRules = 2, 
		RULE_token = 3, RULE_parserRules = 4, RULE_args = 5, RULE_arg = 6, RULE_type = 7, 
		RULE_returnVal = 8, RULE_myRule = 9, RULE_parts = 10, RULE_part = 11, 
		RULE_inputArgs = 12, RULE_inputArg = 13, RULE_inputArgName = 14, RULE_code = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"grammarStructure", "grammarName", "lexerRules", "token", "parserRules", 
			"args", "arg", "type", "returnVal", "myRule", "parts", "part", "inputArgs", 
			"inputArg", "inputArgName", "code"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'grammar'", "';'", "'lexer {'", "'}'", "':'", "'-> ignore'", "'parser {'", 
			"'('", "')'", "'['", "']'", "'|'", "','", "'='", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "RULE_NAME", "TOKEN_NAME", "PATTERN", "CODE", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MyGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class GrammarStructureContext extends ParserRuleContext {
		public GrammarInfo info;
		public GrammarNameContext grammarName;
		public LexerRulesContext lexerRules;
		public ParserRulesContext parserRules;
		public GrammarNameContext grammarName() {
			return getRuleContext(GrammarNameContext.class,0);
		}
		public LexerRulesContext lexerRules() {
			return getRuleContext(LexerRulesContext.class,0);
		}
		public ParserRulesContext parserRules() {
			return getRuleContext(ParserRulesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MyGrammarParser.EOF, 0); }
		public GrammarStructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarStructure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterGrammarStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitGrammarStructure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitGrammarStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarStructureContext grammarStructure() throws RecognitionException {
		GrammarStructureContext _localctx = new GrammarStructureContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_grammarStructure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__0);
			setState(33);
			((GrammarStructureContext)_localctx).grammarName = grammarName();
			setState(34);
			match(T__1);
			setState(35);
			((GrammarStructureContext)_localctx).lexerRules = lexerRules();
			setState(36);
			((GrammarStructureContext)_localctx).parserRules = parserRules();
			setState(37);
			match(EOF);
			 ((GrammarStructureContext)_localctx).info =  new GrammarInfo((((GrammarStructureContext)_localctx).grammarName!=null?_input.getText(((GrammarStructureContext)_localctx).grammarName.start,((GrammarStructureContext)_localctx).grammarName.stop):null), ((GrammarStructureContext)_localctx).lexerRules.list, ((GrammarStructureContext)_localctx).parserRules.list); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrammarNameContext extends ParserRuleContext {
		public TerminalNode TOKEN_NAME() { return getToken(MyGrammarParser.TOKEN_NAME, 0); }
		public TerminalNode RULE_NAME() { return getToken(MyGrammarParser.RULE_NAME, 0); }
		public GrammarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterGrammarName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitGrammarName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitGrammarName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarNameContext grammarName() throws RecognitionException {
		GrammarNameContext _localctx = new GrammarNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_grammarName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_la = _input.LA(1);
			if ( !(_la==RULE_NAME || _la==TOKEN_NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerRulesContext extends ParserRuleContext {
		public List<GrammarToken> list;
		public TokenContext token;
		public List<TokenContext> token() {
			return getRuleContexts(TokenContext.class);
		}
		public TokenContext token(int i) {
			return getRuleContext(TokenContext.class,i);
		}
		public LexerRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexerRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterLexerRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitLexerRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitLexerRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexerRulesContext lexerRules() throws RecognitionException {
		LexerRulesContext _localctx = new LexerRulesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lexerRules);

			List<GrammarToken> list = new ArrayList<>();
			((LexerRulesContext)_localctx).list =  list;

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__2);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_NAME) {
				{
				{
				setState(43);
				((LexerRulesContext)_localctx).token = token();
				 _localctx.list.add(((LexerRulesContext)_localctx).token.info); 
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TokenContext extends ParserRuleContext {
		public GrammarToken info;
		public boolean ignore = false;;
		public Token n;
		public Token p;
		public TerminalNode TOKEN_NAME() { return getToken(MyGrammarParser.TOKEN_NAME, 0); }
		public TerminalNode PATTERN() { return getToken(MyGrammarParser.PATTERN, 0); }
		public TokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenContext token() throws RecognitionException {
		TokenContext _localctx = new TokenContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_token);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			((TokenContext)_localctx).n = match(TOKEN_NAME);
			setState(54);
			match(T__4);
			setState(55);
			((TokenContext)_localctx).p = match(PATTERN);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(56);
				match(T__5);
				((TokenContext)_localctx).ignore =  true;
				}
			}

			setState(60);
			match(T__1);
			((TokenContext)_localctx).info =  new GrammarToken((((TokenContext)_localctx).n!=null?((TokenContext)_localctx).n.getText():null), (((TokenContext)_localctx).p!=null?((TokenContext)_localctx).p.getText():null).replaceAll("\"", ""), _localctx.ignore);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParserRulesContext extends ParserRuleContext {
		public List<ParserRuleInfo> list;
		public List<ParserRuleInfo.AlternativeRule> alts = new ArrayList<>();
		public String tmpArg = "";
		public String tmpReturn = "";
		public Token RULE_NAME;
		public ArgsContext args;
		public ReturnValContext returnVal;
		public MyRuleContext f;
		public MyRuleContext s;
		public List<TerminalNode> RULE_NAME() { return getTokens(MyGrammarParser.RULE_NAME); }
		public TerminalNode RULE_NAME(int i) {
			return getToken(MyGrammarParser.RULE_NAME, i);
		}
		public List<MyRuleContext> myRule() {
			return getRuleContexts(MyRuleContext.class);
		}
		public MyRuleContext myRule(int i) {
			return getRuleContext(MyRuleContext.class,i);
		}
		public List<ArgsContext> args() {
			return getRuleContexts(ArgsContext.class);
		}
		public ArgsContext args(int i) {
			return getRuleContext(ArgsContext.class,i);
		}
		public List<ReturnValContext> returnVal() {
			return getRuleContexts(ReturnValContext.class);
		}
		public ReturnValContext returnVal(int i) {
			return getRuleContext(ReturnValContext.class,i);
		}
		public ParserRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parserRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterParserRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitParserRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitParserRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParserRulesContext parserRules() throws RecognitionException {
		ParserRulesContext _localctx = new ParserRulesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parserRules);

				List<ParserRuleInfo> list = new ArrayList<>();
				((ParserRulesContext)_localctx).list =  list;
			
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__6);
			setState(94); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64);
				((ParserRulesContext)_localctx).RULE_NAME = match(RULE_NAME);
				setState(65);
				match(T__7);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RULE_NAME || _la==TOKEN_NAME) {
					{
					setState(66);
					((ParserRulesContext)_localctx).args = args();
					((ParserRulesContext)_localctx).tmpArg =  (((ParserRulesContext)_localctx).args!=null?_input.getText(((ParserRulesContext)_localctx).args.start,((ParserRulesContext)_localctx).args.stop):null);
					}
				}

				setState(71);
				match(T__8);
				setState(72);
				match(T__9);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RULE_NAME || _la==TOKEN_NAME) {
					{
					setState(73);
					((ParserRulesContext)_localctx).returnVal = returnVal();
					((ParserRulesContext)_localctx).tmpReturn =  (((ParserRulesContext)_localctx).returnVal!=null?_input.getText(((ParserRulesContext)_localctx).returnVal.start,((ParserRulesContext)_localctx).returnVal.stop):null);
					}
				}

				setState(78);
				match(T__10);
				setState(79);
				match(T__4);
				setState(80);
				((ParserRulesContext)_localctx).f = myRule();
				_localctx.alts.add(((ParserRulesContext)_localctx).f.alt);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(82);
					match(T__11);
					setState(83);
					((ParserRulesContext)_localctx).s = myRule();
					_localctx.alts.add(((ParserRulesContext)_localctx).s.alt);
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(91);
				match(T__1);
				list.add(new ParserRuleInfo((((ParserRulesContext)_localctx).RULE_NAME!=null?((ParserRulesContext)_localctx).RULE_NAME.getText():null), _localctx.tmpArg, _localctx.tmpReturn, _localctx.alts)); ((ParserRulesContext)_localctx).alts =  new ArrayList<>(); ((ParserRulesContext)_localctx).tmpArg =  ""; ((ParserRulesContext)_localctx).tmpReturn =  "";
				}
				}
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RULE_NAME );
			setState(98);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			arg();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(101);
				match(T__12);
				setState(102);
				arg();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RULE_NAME() { return getToken(MyGrammarParser.RULE_NAME, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			type();
			setState(109);
			match(T__13);
			setState(110);
			match(RULE_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode RULE_NAME() { return getToken(MyGrammarParser.RULE_NAME, 0); }
		public TerminalNode TOKEN_NAME() { return getToken(MyGrammarParser.TOKEN_NAME, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !(_la==RULE_NAME || _la==TOKEN_NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnValContext extends ParserRuleContext {
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public ReturnValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterReturnVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitReturnVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitReturnVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnValContext returnVal() throws RecognitionException {
		ReturnValContext _localctx = new ReturnValContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			arg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MyRuleContext extends ParserRuleContext {
		public ParserRuleInfo.AlternativeRule alt;
		public PartsContext parts() {
			return getRuleContext(PartsContext.class,0);
		}
		public MyRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterMyRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitMyRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitMyRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MyRuleContext myRule() throws RecognitionException {
		MyRuleContext _localctx = new MyRuleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_myRule);

			ParserRuleInfo.AlternativeRule alt = new ParserRuleInfo.AlternativeRule();
			((MyRuleContext)_localctx).alt =  alt;

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			parts(_localctx.alt);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartsContext extends ParserRuleContext {
		public ParserRuleInfo.AlternativeRule alt;
		public PartContext part;
		public List<PartContext> part() {
			return getRuleContexts(PartContext.class);
		}
		public PartContext part(int i) {
			return getRuleContext(PartContext.class,i);
		}
		public PartsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PartsContext(ParserRuleContext parent, int invokingState, ParserRuleInfo.AlternativeRule alt) {
			super(parent, invokingState);
			this.alt = alt;
		}
		@Override public int getRuleIndex() { return RULE_parts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterParts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitParts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitParts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartsContext parts(ParserRuleInfo.AlternativeRule alt) throws RecognitionException {
		PartsContext _localctx = new PartsContext(_ctx, getState(), alt);
		enterRule(_localctx, 20, RULE_parts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118);
				((PartsContext)_localctx).part = part();
				_localctx.alt.parts.add(((PartsContext)_localctx).part.info);
				}
				}
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RULE_NAME || _la==TOKEN_NAME );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartContext extends ParserRuleContext {
		public ParserRuleInfo.RuleAndCode info;
		public String codeLines = "";
		public String tmpArgs = "";
		public Token TOKEN_NAME;
		public CodeContext code;
		public Token RULE_NAME;
		public InputArgsContext inputArgs;
		public TerminalNode TOKEN_NAME() { return getToken(MyGrammarParser.TOKEN_NAME, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode RULE_NAME() { return getToken(MyGrammarParser.RULE_NAME, 0); }
		public InputArgsContext inputArgs() {
			return getRuleContext(InputArgsContext.class,0);
		}
		public PartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartContext part() throws RecognitionException {
		PartContext _localctx = new PartContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_part);
		int _la;
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				((PartContext)_localctx).TOKEN_NAME = match(TOKEN_NAME);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODE) {
					{
					setState(126);
					((PartContext)_localctx).code = code();
					 ((PartContext)_localctx).codeLines =  (((PartContext)_localctx).code!=null?_input.getText(((PartContext)_localctx).code.start,((PartContext)_localctx).code.stop):null); 
					}
				}

				 ((PartContext)_localctx).info =  new ParserRuleInfo.RuleAndCode((((PartContext)_localctx).TOKEN_NAME!=null?((PartContext)_localctx).TOKEN_NAME.getText():null), "", _localctx.codeLines, true); ((PartContext)_localctx).codeLines =  ""; ((PartContext)_localctx).tmpArgs =  "";
				}
				break;
			case RULE_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				((PartContext)_localctx).RULE_NAME = match(RULE_NAME);
				setState(133);
				match(T__7);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RULE_NAME) {
					{
					setState(134);
					((PartContext)_localctx).inputArgs = inputArgs();
					((PartContext)_localctx).tmpArgs =  (((PartContext)_localctx).inputArgs!=null?_input.getText(((PartContext)_localctx).inputArgs.start,((PartContext)_localctx).inputArgs.stop):null);
					}
				}

				setState(139);
				match(T__8);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODE) {
					{
					setState(140);
					((PartContext)_localctx).code = code();
					 ((PartContext)_localctx).codeLines =  (((PartContext)_localctx).code!=null?_input.getText(((PartContext)_localctx).code.start,((PartContext)_localctx).code.stop):null); 
					}
				}

				 ((PartContext)_localctx).info =  new ParserRuleInfo.RuleAndCode((((PartContext)_localctx).RULE_NAME!=null?((PartContext)_localctx).RULE_NAME.getText():null), _localctx.tmpArgs, _localctx.codeLines, false); ((PartContext)_localctx).codeLines =  ""; ((PartContext)_localctx).tmpArgs =  "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputArgsContext extends ParserRuleContext {
		public List<InputArgContext> inputArg() {
			return getRuleContexts(InputArgContext.class);
		}
		public InputArgContext inputArg(int i) {
			return getRuleContext(InputArgContext.class,i);
		}
		public InputArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterInputArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitInputArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitInputArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputArgsContext inputArgs() throws RecognitionException {
		InputArgsContext _localctx = new InputArgsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_inputArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			inputArg();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(149);
				match(T__12);
				setState(150);
				inputArg();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputArgContext extends ParserRuleContext {
		public List<InputArgNameContext> inputArgName() {
			return getRuleContexts(InputArgNameContext.class);
		}
		public InputArgNameContext inputArgName(int i) {
			return getRuleContext(InputArgNameContext.class,i);
		}
		public InputArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterInputArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitInputArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitInputArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputArgContext inputArg() throws RecognitionException {
		InputArgContext _localctx = new InputArgContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_inputArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			inputArgName();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(157);
				match(T__14);
				setState(158);
				inputArgName();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputArgNameContext extends ParserRuleContext {
		public TerminalNode RULE_NAME() { return getToken(MyGrammarParser.RULE_NAME, 0); }
		public InputArgNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputArgName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterInputArgName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitInputArgName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitInputArgName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputArgNameContext inputArgName() throws RecognitionException {
		InputArgNameContext _localctx = new InputArgNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_inputArgName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(RULE_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeContext extends ParserRuleContext {
		public TerminalNode CODE() { return getToken(MyGrammarParser.CODE, 0); }
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(CODE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u00ab\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\7\4\61\n\4\f\4\16\4\64"+
		"\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5=\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6H\n\6\3\6\3\6\3\6\3\6\3\6\5\6O\n\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\6Y\n\6\f\6\16\6\\\13\6\3\6\3\6\3\6\6\6a\n\6\r\6\16\6b\3\6\3"+
		"\6\3\7\3\7\3\7\7\7j\n\7\f\7\16\7m\13\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\f\6\f|\n\f\r\f\16\f}\3\r\3\r\3\r\3\r\5\r\u0084\n"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008c\n\r\3\r\3\r\3\r\3\r\5\r\u0092\n\r"+
		"\3\r\5\r\u0095\n\r\3\16\3\16\3\16\7\16\u009a\n\16\f\16\16\16\u009d\13"+
		"\16\3\17\3\17\3\17\7\17\u00a2\n\17\f\17\16\17\u00a5\13\17\3\20\3\20\3"+
		"\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\3\3\2\22"+
		"\23\2\u00a8\2\"\3\2\2\2\4*\3\2\2\2\6,\3\2\2\2\b\67\3\2\2\2\nA\3\2\2\2"+
		"\ff\3\2\2\2\16n\3\2\2\2\20r\3\2\2\2\22t\3\2\2\2\24v\3\2\2\2\26{\3\2\2"+
		"\2\30\u0094\3\2\2\2\32\u0096\3\2\2\2\34\u009e\3\2\2\2\36\u00a6\3\2\2\2"+
		" \u00a8\3\2\2\2\"#\7\3\2\2#$\5\4\3\2$%\7\4\2\2%&\5\6\4\2&\'\5\n\6\2\'"+
		"(\7\2\2\3()\b\2\1\2)\3\3\2\2\2*+\t\2\2\2+\5\3\2\2\2,\62\7\5\2\2-.\5\b"+
		"\5\2./\b\4\1\2/\61\3\2\2\2\60-\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62"+
		"\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\65\66\7\6\2\2\66\7\3\2\2\2\67"+
		"8\7\23\2\289\7\7\2\29<\7\24\2\2:;\7\b\2\2;=\b\5\1\2<:\3\2\2\2<=\3\2\2"+
		"\2=>\3\2\2\2>?\7\4\2\2?@\b\5\1\2@\t\3\2\2\2A`\7\t\2\2BC\7\22\2\2CG\7\n"+
		"\2\2DE\5\f\7\2EF\b\6\1\2FH\3\2\2\2GD\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7\13"+
		"\2\2JN\7\f\2\2KL\5\22\n\2LM\b\6\1\2MO\3\2\2\2NK\3\2\2\2NO\3\2\2\2OP\3"+
		"\2\2\2PQ\7\r\2\2QR\7\7\2\2RS\5\24\13\2SZ\b\6\1\2TU\7\16\2\2UV\5\24\13"+
		"\2VW\b\6\1\2WY\3\2\2\2XT\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2"+
		"\2\2\\Z\3\2\2\2]^\7\4\2\2^_\b\6\1\2_a\3\2\2\2`B\3\2\2\2ab\3\2\2\2b`\3"+
		"\2\2\2bc\3\2\2\2cd\3\2\2\2de\7\6\2\2e\13\3\2\2\2fk\5\16\b\2gh\7\17\2\2"+
		"hj\5\16\b\2ig\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\r\3\2\2\2mk\3\2\2"+
		"\2no\5\20\t\2op\7\20\2\2pq\7\22\2\2q\17\3\2\2\2rs\t\2\2\2s\21\3\2\2\2"+
		"tu\5\16\b\2u\23\3\2\2\2vw\5\26\f\2w\25\3\2\2\2xy\5\30\r\2yz\b\f\1\2z|"+
		"\3\2\2\2{x\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\27\3\2\2\2\177\u0083"+
		"\7\23\2\2\u0080\u0081\5 \21\2\u0081\u0082\b\r\1\2\u0082\u0084\3\2\2\2"+
		"\u0083\u0080\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0095"+
		"\b\r\1\2\u0086\u0087\7\22\2\2\u0087\u008b\7\n\2\2\u0088\u0089\5\32\16"+
		"\2\u0089\u008a\b\r\1\2\u008a\u008c\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0091\7\13\2\2\u008e\u008f\5 \21\2"+
		"\u008f\u0090\b\r\1\2\u0090\u0092\3\2\2\2\u0091\u008e\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\b\r\1\2\u0094\177\3\2\2\2\u0094"+
		"\u0086\3\2\2\2\u0095\31\3\2\2\2\u0096\u009b\5\34\17\2\u0097\u0098\7\17"+
		"\2\2\u0098\u009a\5\34\17\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\33\3\2\2\2\u009d\u009b\3\2\2"+
		"\2\u009e\u00a3\5\36\20\2\u009f\u00a0\7\21\2\2\u00a0\u00a2\5\36\20\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\35\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7\22\2\2\u00a7\37"+
		"\3\2\2\2\u00a8\u00a9\7\25\2\2\u00a9!\3\2\2\2\20\62<GNZbk}\u0083\u008b"+
		"\u0091\u0094\u009b\u00a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}