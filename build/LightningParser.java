// Generated from Lightning.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LightningParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, ComentarioDeUmaLinha=14, BOOLEANO=15, 
		INTEIRO=16, CADEIA=17, CARACTER=18, REAL=19, BooleanoLiteral=20, PontoVirgula=21, 
		CadeiaLiteral=22, CaracterLiteral=23, ID=24, InteiroLiteral=25, RealLiteral=26, 
		SEP=27;
	public static final int
		RULE_declaracao = 0, RULE_listaDeDeclaracaoDeVariaveis = 1, RULE_tipoDaVariavel = 2, 
		RULE_declaracaoDaVariavel = 3, RULE_atribuivel = 4, RULE_expressaoUnica = 5, 
		RULE_literal = 6, RULE_numeroLiteral = 7, RULE_fdi = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"declaracao", "listaDeDeclaracaoDeVariaveis", "tipoDaVariavel", "declaracaoDaVariavel", 
			"atribuivel", "expressaoUnica", "literal", "numeroLiteral", "fdi"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'='", "'*'", "'/'", "'%'", "'+'", "'-'", "'=='", "'!='", 
			"'<'", "'>'", "'<='", "'>='", null, "'booleano'", "'inteiro'", "'cadeia'", 
			"'caracter'", "'real'", null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ComentarioDeUmaLinha", "BOOLEANO", "INTEIRO", "CADEIA", 
			"CARACTER", "REAL", "BooleanoLiteral", "PontoVirgula", "CadeiaLiteral", 
			"CaracterLiteral", "ID", "InteiroLiteral", "RealLiteral", "SEP"
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
	public String getGrammarFileName() { return "Lightning.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LightningParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DeclaracaoContext extends ParserRuleContext {
		public ListaDeDeclaracaoDeVariaveisContext listaDeDeclaracaoDeVariaveis() {
			return getRuleContext(ListaDeDeclaracaoDeVariaveisContext.class,0);
		}
		public FdiContext fdi() {
			return getRuleContext(FdiContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LightningListener ) ((LightningListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LightningListener ) ((LightningListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			listaDeDeclaracaoDeVariaveis();
			setState(19);
			fdi();
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

	public static class ListaDeDeclaracaoDeVariaveisContext extends ParserRuleContext {
		public TipoDaVariavelContext tipoDaVariavel() {
			return getRuleContext(TipoDaVariavelContext.class,0);
		}
		public List<DeclaracaoDaVariavelContext> declaracaoDaVariavel() {
			return getRuleContexts(DeclaracaoDaVariavelContext.class);
		}
		public DeclaracaoDaVariavelContext declaracaoDaVariavel(int i) {
			return getRuleContext(DeclaracaoDaVariavelContext.class,i);
		}
		public ListaDeDeclaracaoDeVariaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaDeDeclaracaoDeVariaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LightningListener ) ((LightningListener)listener).enterListaDeDeclaracaoDeVariaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LightningListener ) ((LightningListener)listener).exitListaDeDeclaracaoDeVariaveis(this);
		}
	}

	public final ListaDeDeclaracaoDeVariaveisContext listaDeDeclaracaoDeVariaveis() throws RecognitionException {
		ListaDeDeclaracaoDeVariaveisContext _localctx = new ListaDeDeclaracaoDeVariaveisContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_listaDeDeclaracaoDeVariaveis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			tipoDaVariavel();
			setState(22);
			declaracaoDaVariavel();
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(23);
				match(T__0);
				setState(24);
				declaracaoDaVariavel();
				}
				}
				setState(29);
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

	public static class TipoDaVariavelContext extends ParserRuleContext {
		public TerminalNode BOOLEANO() { return getToken(LightningParser.BOOLEANO, 0); }
		public TerminalNode INTEIRO() { return getToken(LightningParser.INTEIRO, 0); }
		public TerminalNode CADEIA() { return getToken(LightningParser.CADEIA, 0); }
		public TerminalNode CARACTER() { return getToken(LightningParser.CARACTER, 0); }
		public TerminalNode REAL() { return getToken(LightningParser.REAL, 0); }
		public TipoDaVariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoDaVariavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LightningListener ) ((LightningListener)listener).enterTipoDaVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LightningListener ) ((LightningListener)listener).exitTipoDaVariavel(this);
		}
	}

	public final TipoDaVariavelContext tipoDaVariavel() throws RecognitionException {
		TipoDaVariavelContext _localctx = new TipoDaVariavelContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tipoDaVariavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEANO) | (1L << INTEIRO) | (1L << CADEIA) | (1L << CARACTER) | (1L << REAL))) != 0)) ) {
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

	public static class DeclaracaoDaVariavelContext extends ParserRuleContext {
		public AtribuivelContext atribuivel() {
			return getRuleContext(AtribuivelContext.class,0);
		}
		public ExpressaoUnicaContext expressaoUnica() {
			return getRuleContext(ExpressaoUnicaContext.class,0);
		}
		public DeclaracaoDaVariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoDaVariavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LightningListener ) ((LightningListener)listener).enterDeclaracaoDaVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LightningListener ) ((LightningListener)listener).exitDeclaracaoDaVariavel(this);
		}
	}

	public final DeclaracaoDaVariavelContext declaracaoDaVariavel() throws RecognitionException {
		DeclaracaoDaVariavelContext _localctx = new DeclaracaoDaVariavelContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracaoDaVariavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			atribuivel();
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(33);
				match(T__1);
				setState(34);
				expressaoUnica(0);
				}
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

	public static class AtribuivelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LightningParser.ID, 0); }
		public AtribuivelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuivel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LightningListener ) ((LightningListener)listener).enterAtribuivel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LightningListener ) ((LightningListener)listener).exitAtribuivel(this);
		}
	}

	public final AtribuivelContext atribuivel() throws RecognitionException {
		AtribuivelContext _localctx = new AtribuivelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atribuivel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(ID);
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

	public static class ExpressaoUnicaContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ID() { return getToken(LightningParser.ID, 0); }
		public List<ExpressaoUnicaContext> expressaoUnica() {
			return getRuleContexts(ExpressaoUnicaContext.class);
		}
		public ExpressaoUnicaContext expressaoUnica(int i) {
			return getRuleContext(ExpressaoUnicaContext.class,i);
		}
		public ExpressaoUnicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoUnica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LightningListener ) ((LightningListener)listener).enterExpressaoUnica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LightningListener ) ((LightningListener)listener).exitExpressaoUnica(this);
		}
	}

	public final ExpressaoUnicaContext expressaoUnica() throws RecognitionException {
		return expressaoUnica(0);
	}

	private ExpressaoUnicaContext expressaoUnica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoUnicaContext _localctx = new ExpressaoUnicaContext(_ctx, _parentState);
		ExpressaoUnicaContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expressaoUnica, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BooleanoLiteral:
			case CadeiaLiteral:
			case CaracterLiteral:
			case InteiroLiteral:
			case RealLiteral:
				{
				setState(40);
				literal();
				}
				break;
			case ID:
				{
				setState(41);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(59);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoUnicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoUnica);
						setState(44);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(45);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(46);
						expressaoUnica(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoUnicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoUnica);
						setState(47);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(48);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__6) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(49);
						expressaoUnica(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressaoUnicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoUnica);
						setState(50);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(51);
						_la = _input.LA(1);
						if ( !(_la==T__7 || _la==T__8) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(52);
						expressaoUnica(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpressaoUnicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoUnica);
						setState(53);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(54);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(55);
						expressaoUnica(5);
						}
						break;
					case 5:
						{
						_localctx = new ExpressaoUnicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoUnica);
						setState(56);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(57);
						match(T__1);
						setState(58);
						expressaoUnica(4);
						}
						break;
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode CadeiaLiteral() { return getToken(LightningParser.CadeiaLiteral, 0); }
		public TerminalNode CaracterLiteral() { return getToken(LightningParser.CaracterLiteral, 0); }
		public TerminalNode BooleanoLiteral() { return getToken(LightningParser.BooleanoLiteral, 0); }
		public NumeroLiteralContext numeroLiteral() {
			return getRuleContext(NumeroLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LightningListener ) ((LightningListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LightningListener ) ((LightningListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_literal);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CadeiaLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(CadeiaLiteral);
				}
				break;
			case CaracterLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(CaracterLiteral);
				}
				break;
			case BooleanoLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(BooleanoLiteral);
				}
				break;
			case InteiroLiteral:
			case RealLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				numeroLiteral();
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

	public static class NumeroLiteralContext extends ParserRuleContext {
		public TerminalNode InteiroLiteral() { return getToken(LightningParser.InteiroLiteral, 0); }
		public TerminalNode RealLiteral() { return getToken(LightningParser.RealLiteral, 0); }
		public NumeroLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeroLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LightningListener ) ((LightningListener)listener).enterNumeroLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LightningListener ) ((LightningListener)listener).exitNumeroLiteral(this);
		}
	}

	public final NumeroLiteralContext numeroLiteral() throws RecognitionException {
		NumeroLiteralContext _localctx = new NumeroLiteralContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_numeroLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !(_la==InteiroLiteral || _la==RealLiteral) ) {
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

	public static class FdiContext extends ParserRuleContext {
		public TerminalNode PontoVirgula() { return getToken(LightningParser.PontoVirgula, 0); }
		public FdiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fdi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LightningListener ) ((LightningListener)listener).enterFdi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LightningListener ) ((LightningListener)listener).exitFdi(this);
		}
	}

	public final FdiContext fdi() throws RecognitionException {
		FdiContext _localctx = new FdiContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fdi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(PontoVirgula);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expressaoUnica_sempred((ExpressaoUnicaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressaoUnica_sempred(ExpressaoUnicaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35M\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\7\3\34\n\3\f\3\16\3\37\13\3\3\4\3\4\3\5\3\5\3\5\5\5&"+
		"\n\5\3\6\3\6\3\7\3\7\3\7\5\7-\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\7\7>\n\7\f\7\16\7A\13\7\3\b\3\b\3\b\3\b\5\bG"+
		"\n\b\3\t\3\t\3\n\3\n\3\n\2\3\f\13\2\4\6\b\n\f\16\20\22\2\b\3\2\21\25\3"+
		"\2\5\7\3\2\b\t\3\2\n\13\3\2\f\17\3\2\33\34\2N\2\24\3\2\2\2\4\27\3\2\2"+
		"\2\6 \3\2\2\2\b\"\3\2\2\2\n\'\3\2\2\2\f,\3\2\2\2\16F\3\2\2\2\20H\3\2\2"+
		"\2\22J\3\2\2\2\24\25\5\4\3\2\25\26\5\22\n\2\26\3\3\2\2\2\27\30\5\6\4\2"+
		"\30\35\5\b\5\2\31\32\7\3\2\2\32\34\5\b\5\2\33\31\3\2\2\2\34\37\3\2\2\2"+
		"\35\33\3\2\2\2\35\36\3\2\2\2\36\5\3\2\2\2\37\35\3\2\2\2 !\t\2\2\2!\7\3"+
		"\2\2\2\"%\5\n\6\2#$\7\4\2\2$&\5\f\7\2%#\3\2\2\2%&\3\2\2\2&\t\3\2\2\2\'"+
		"(\7\32\2\2(\13\3\2\2\2)*\b\7\1\2*-\5\16\b\2+-\7\32\2\2,)\3\2\2\2,+\3\2"+
		"\2\2-?\3\2\2\2./\f\t\2\2/\60\t\3\2\2\60>\5\f\7\n\61\62\f\b\2\2\62\63\t"+
		"\4\2\2\63>\5\f\7\t\64\65\f\7\2\2\65\66\t\5\2\2\66>\5\f\7\b\678\f\6\2\2"+
		"89\t\6\2\29>\5\f\7\7:;\f\5\2\2;<\7\4\2\2<>\5\f\7\6=.\3\2\2\2=\61\3\2\2"+
		"\2=\64\3\2\2\2=\67\3\2\2\2=:\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\r"+
		"\3\2\2\2A?\3\2\2\2BG\7\30\2\2CG\7\31\2\2DG\7\26\2\2EG\5\20\t\2FB\3\2\2"+
		"\2FC\3\2\2\2FD\3\2\2\2FE\3\2\2\2G\17\3\2\2\2HI\t\7\2\2I\21\3\2\2\2JK\7"+
		"\27\2\2K\23\3\2\2\2\b\35%,=?F";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}