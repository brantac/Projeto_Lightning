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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		ComentarioDeUmaLinha=18, BOOLEANO=19, INTEIRO=20, CADEIA=21, CARACTER=22, 
		REAL=23, SE=24, SenaoSe=25, BooleanoLiteral=26, PontoVirgula=27, CadeiaLiteral=28, 
		CaracterLiteral=29, ID=30, InteiroLiteral=31, RealLiteral=32, SEP=33;
	public static final int
		RULE_declaracao = 0, RULE_listaDeDeclaracaoDeVariaveis = 1, RULE_tipoDaVariavel = 2, 
		RULE_declaracaoDaVariavel = 3, RULE_atribuivel = 4, RULE_expressaoEmSequencia = 5, 
		RULE_expressaoUnica = 6, RULE_literal = 7, RULE_numeroLiteral = 8, RULE_instrucao = 9, 
		RULE_bloco = 10, RULE_listaDeInstrucoes = 11, RULE_instrucaoSE = 12, RULE_instrucaoVazia = 13, 
		RULE_fdi = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"declaracao", "listaDeDeclaracaoDeVariaveis", "tipoDaVariavel", "declaracaoDaVariavel", 
			"atribuivel", "expressaoEmSequencia", "expressaoUnica", "literal", "numeroLiteral", 
			"instrucao", "bloco", "listaDeInstrucoes", "instrucaoSE", "instrucaoVazia", 
			"fdi"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'='", "'*'", "'/'", "'%'", "'+'", "'-'", "'=='", "'!='", 
			"'<'", "'>'", "'<='", "'>='", "'{'", "'}'", "'('", "')'", null, "'booleano'", 
			"'inteiro'", "'cadeia'", "'caracter'", "'real'", "'se'", "'senaose'", 
			null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "ComentarioDeUmaLinha", "BOOLEANO", 
			"INTEIRO", "CADEIA", "CARACTER", "REAL", "SE", "SenaoSe", "BooleanoLiteral", 
			"PontoVirgula", "CadeiaLiteral", "CaracterLiteral", "ID", "InteiroLiteral", 
			"RealLiteral", "SEP"
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
			setState(30);
			listaDeDeclaracaoDeVariaveis();
			setState(31);
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
			setState(33);
			tipoDaVariavel();
			setState(34);
			declaracaoDaVariavel();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(35);
				match(T__0);
				setState(36);
				declaracaoDaVariavel();
				}
				}
				setState(41);
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
			setState(42);
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
			setState(44);
			atribuivel();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(45);
				match(T__1);
				setState(46);
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
			setState(49);
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

	public static class ExpressaoEmSequenciaContext extends ParserRuleContext {
		public List<ExpressaoUnicaContext> expressaoUnica() {
			return getRuleContexts(ExpressaoUnicaContext.class);
		}
		public ExpressaoUnicaContext expressaoUnica(int i) {
			return getRuleContext(ExpressaoUnicaContext.class,i);
		}
		public ExpressaoEmSequenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoEmSequencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LightningListener ) ((LightningListener)listener).enterExpressaoEmSequencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LightningListener ) ((LightningListener)listener).exitExpressaoEmSequencia(this);
		}
	}

	public final ExpressaoEmSequenciaContext expressaoEmSequencia() throws RecognitionException {
		ExpressaoEmSequenciaContext _localctx = new ExpressaoEmSequenciaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expressaoEmSequencia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			expressaoUnica(0);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(52);
				match(T__0);
				setState(53);
				expressaoUnica(0);
				}
				}
				setState(58);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expressaoUnica, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BooleanoLiteral:
			case CadeiaLiteral:
			case CaracterLiteral:
			case InteiroLiteral:
			case RealLiteral:
				{
				setState(60);
				literal();
				}
				break;
			case ID:
				{
				setState(61);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(79);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoUnicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoUnica);
						setState(64);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(65);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(66);
						expressaoUnica(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoUnicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoUnica);
						setState(67);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(68);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__6) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(69);
						expressaoUnica(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressaoUnicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoUnica);
						setState(70);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(71);
						_la = _input.LA(1);
						if ( !(_la==T__7 || _la==T__8) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(72);
						expressaoUnica(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpressaoUnicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoUnica);
						setState(73);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(74);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(75);
						expressaoUnica(5);
						}
						break;
					case 5:
						{
						_localctx = new ExpressaoUnicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoUnica);
						setState(76);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(77);
						match(T__1);
						setState(78);
						expressaoUnica(4);
						}
						break;
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		enterRule(_localctx, 14, RULE_literal);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CadeiaLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(CadeiaLiteral);
				}
				break;
			case CaracterLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(CaracterLiteral);
				}
				break;
			case BooleanoLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(BooleanoLiteral);
				}
				break;
			case InteiroLiteral:
			case RealLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
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
		enterRule(_localctx, 16, RULE_numeroLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
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

	public static class InstrucaoContext extends ParserRuleContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public InstrucaoSEContext instrucaoSE() {
			return getRuleContext(InstrucaoSEContext.class,0);
		}
		public InstrucaoVaziaContext instrucaoVazia() {
			return getRuleContext(InstrucaoVaziaContext.class,0);
		}
		public InstrucaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LightningListener ) ((LightningListener)listener).enterInstrucao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LightningListener ) ((LightningListener)listener).exitInstrucao(this);
		}
	}

	public final InstrucaoContext instrucao() throws RecognitionException {
		InstrucaoContext _localctx = new InstrucaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_instrucao);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				bloco();
				}
				break;
			case SE:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				instrucaoSE();
				}
				break;
			case PontoVirgula:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				instrucaoVazia();
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

	public static class BlocoContext extends ParserRuleContext {
		public ListaDeInstrucoesContext listaDeInstrucoes() {
			return getRuleContext(ListaDeInstrucoesContext.class,0);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LightningListener ) ((LightningListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LightningListener ) ((LightningListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__13);
			setState(98);
			listaDeInstrucoes();
			setState(99);
			match(T__14);
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

	public static class ListaDeInstrucoesContext extends ParserRuleContext {
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public ListaDeInstrucoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaDeInstrucoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LightningListener ) ((LightningListener)listener).enterListaDeInstrucoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LightningListener ) ((LightningListener)listener).exitListaDeInstrucoes(this);
		}
	}

	public final ListaDeInstrucoesContext listaDeInstrucoes() throws RecognitionException {
		ListaDeInstrucoesContext _localctx = new ListaDeInstrucoesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_listaDeInstrucoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(101);
				instrucao();
				}
				}
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << SE) | (1L << PontoVirgula))) != 0) );
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

	public static class InstrucaoSEContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(LightningParser.SE, 0); }
		public ExpressaoEmSequenciaContext expressaoEmSequencia() {
			return getRuleContext(ExpressaoEmSequenciaContext.class,0);
		}
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public TerminalNode SenaoSe() { return getToken(LightningParser.SenaoSe, 0); }
		public InstrucaoSEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucaoSE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LightningListener ) ((LightningListener)listener).enterInstrucaoSE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LightningListener ) ((LightningListener)listener).exitInstrucaoSE(this);
		}
	}

	public final InstrucaoSEContext instrucaoSE() throws RecognitionException {
		InstrucaoSEContext _localctx = new InstrucaoSEContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_instrucaoSE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(SE);
			setState(107);
			match(T__15);
			setState(108);
			expressaoEmSequencia();
			setState(109);
			match(T__16);
			setState(110);
			instrucao();
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(111);
				match(SenaoSe);
				setState(112);
				instrucao();
				}
				break;
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

	public static class InstrucaoVaziaContext extends ParserRuleContext {
		public TerminalNode PontoVirgula() { return getToken(LightningParser.PontoVirgula, 0); }
		public InstrucaoVaziaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucaoVazia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LightningListener ) ((LightningListener)listener).enterInstrucaoVazia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LightningListener ) ((LightningListener)listener).exitInstrucaoVazia(this);
		}
	}

	public final InstrucaoVaziaContext instrucaoVazia() throws RecognitionException {
		InstrucaoVaziaContext _localctx = new InstrucaoVaziaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_instrucaoVazia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
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
		enterRule(_localctx, 28, RULE_fdi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
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
		case 6:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#z\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\7\3(\n\3\f\3\16\3+\13\3\3\4\3\4\3\5\3\5\3\5\5\5\62\n\5\3\6\3\6\3\7\3"+
		"\7\3\7\7\79\n\7\f\7\16\7<\13\7\3\b\3\b\3\b\5\bA\n\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bR\n\b\f\b\16\bU\13\b\3\t"+
		"\3\t\3\t\3\t\5\t[\n\t\3\n\3\n\3\13\3\13\3\13\5\13b\n\13\3\f\3\f\3\f\3"+
		"\f\3\r\6\ri\n\r\r\r\16\rj\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16t\n\16"+
		"\3\17\3\17\3\20\3\20\3\20\2\3\16\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36\2\b\3\2\25\31\3\2\5\7\3\2\b\t\3\2\n\13\3\2\f\17\3\2!\"\2z\2 \3\2\2"+
		"\2\4#\3\2\2\2\6,\3\2\2\2\b.\3\2\2\2\n\63\3\2\2\2\f\65\3\2\2\2\16@\3\2"+
		"\2\2\20Z\3\2\2\2\22\\\3\2\2\2\24a\3\2\2\2\26c\3\2\2\2\30h\3\2\2\2\32l"+
		"\3\2\2\2\34u\3\2\2\2\36w\3\2\2\2 !\5\4\3\2!\"\5\36\20\2\"\3\3\2\2\2#$"+
		"\5\6\4\2$)\5\b\5\2%&\7\3\2\2&(\5\b\5\2\'%\3\2\2\2(+\3\2\2\2)\'\3\2\2\2"+
		")*\3\2\2\2*\5\3\2\2\2+)\3\2\2\2,-\t\2\2\2-\7\3\2\2\2.\61\5\n\6\2/\60\7"+
		"\4\2\2\60\62\5\16\b\2\61/\3\2\2\2\61\62\3\2\2\2\62\t\3\2\2\2\63\64\7 "+
		"\2\2\64\13\3\2\2\2\65:\5\16\b\2\66\67\7\3\2\2\679\5\16\b\28\66\3\2\2\2"+
		"9<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\r\3\2\2\2<:\3\2\2\2=>\b\b\1\2>A\5\20\t"+
		"\2?A\7 \2\2@=\3\2\2\2@?\3\2\2\2AS\3\2\2\2BC\f\t\2\2CD\t\3\2\2DR\5\16\b"+
		"\nEF\f\b\2\2FG\t\4\2\2GR\5\16\b\tHI\f\7\2\2IJ\t\5\2\2JR\5\16\b\bKL\f\6"+
		"\2\2LM\t\6\2\2MR\5\16\b\7NO\f\5\2\2OP\7\4\2\2PR\5\16\b\6QB\3\2\2\2QE\3"+
		"\2\2\2QH\3\2\2\2QK\3\2\2\2QN\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\17"+
		"\3\2\2\2US\3\2\2\2V[\7\36\2\2W[\7\37\2\2X[\7\34\2\2Y[\5\22\n\2ZV\3\2\2"+
		"\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[\21\3\2\2\2\\]\t\7\2\2]\23\3\2\2\2^b"+
		"\5\26\f\2_b\5\32\16\2`b\5\34\17\2a^\3\2\2\2a_\3\2\2\2a`\3\2\2\2b\25\3"+
		"\2\2\2cd\7\20\2\2de\5\30\r\2ef\7\21\2\2f\27\3\2\2\2gi\5\24\13\2hg\3\2"+
		"\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\31\3\2\2\2lm\7\32\2\2mn\7\22\2\2n"+
		"o\5\f\7\2op\7\23\2\2ps\5\24\13\2qr\7\33\2\2rt\5\24\13\2sq\3\2\2\2st\3"+
		"\2\2\2t\33\3\2\2\2uv\7\35\2\2v\35\3\2\2\2wx\7\35\2\2x\37\3\2\2\2\f)\61"+
		":@QSZajs";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}