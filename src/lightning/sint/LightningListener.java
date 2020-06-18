// Generated from antlr4/Lightning.g4 by ANTLR 4.8
package lightning.sint;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LightningParser}.
 */
public interface LightningListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LightningParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(LightningParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LightningParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(LightningParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LightningParser#listaDeDeclaracaoDeVariaveis}.
	 * @param ctx the parse tree
	 */
	void enterListaDeDeclaracaoDeVariaveis(LightningParser.ListaDeDeclaracaoDeVariaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link LightningParser#listaDeDeclaracaoDeVariaveis}.
	 * @param ctx the parse tree
	 */
	void exitListaDeDeclaracaoDeVariaveis(LightningParser.ListaDeDeclaracaoDeVariaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link LightningParser#tipoDaVariavel}.
	 * @param ctx the parse tree
	 */
	void enterTipoDaVariavel(LightningParser.TipoDaVariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LightningParser#tipoDaVariavel}.
	 * @param ctx the parse tree
	 */
	void exitTipoDaVariavel(LightningParser.TipoDaVariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LightningParser#declaracaoDaVariavel}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoDaVariavel(LightningParser.DeclaracaoDaVariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LightningParser#declaracaoDaVariavel}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoDaVariavel(LightningParser.DeclaracaoDaVariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LightningParser#atribuivel}.
	 * @param ctx the parse tree
	 */
	void enterAtribuivel(LightningParser.AtribuivelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LightningParser#atribuivel}.
	 * @param ctx the parse tree
	 */
	void exitAtribuivel(LightningParser.AtribuivelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LightningParser#expressaoEmSequencia}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoEmSequencia(LightningParser.ExpressaoEmSequenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LightningParser#expressaoEmSequencia}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoEmSequencia(LightningParser.ExpressaoEmSequenciaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressaoLiteral}
	 * labeled alternative in {@link LightningParser#expressaoUnica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoLiteral(LightningParser.ExpressaoLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressaoLiteral}
	 * labeled alternative in {@link LightningParser#expressaoUnica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoLiteral(LightningParser.ExpressaoLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressaoDeIgualdade}
	 * labeled alternative in {@link LightningParser#expressaoUnica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoDeIgualdade(LightningParser.ExpressaoDeIgualdadeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressaoDeIgualdade}
	 * labeled alternative in {@link LightningParser#expressaoUnica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoDeIgualdade(LightningParser.ExpressaoDeIgualdadeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressaoDeRelacao}
	 * labeled alternative in {@link LightningParser#expressaoUnica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoDeRelacao(LightningParser.ExpressaoDeRelacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressaoDeRelacao}
	 * labeled alternative in {@link LightningParser#expressaoUnica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoDeRelacao(LightningParser.ExpressaoDeRelacaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressaoDeAtribuicao}
	 * labeled alternative in {@link LightningParser#expressaoUnica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoDeAtribuicao(LightningParser.ExpressaoDeAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressaoDeAtribuicao}
	 * labeled alternative in {@link LightningParser#expressaoUnica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoDeAtribuicao(LightningParser.ExpressaoDeAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressaoID}
	 * labeled alternative in {@link LightningParser#expressaoUnica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoID(LightningParser.ExpressaoIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressaoID}
	 * labeled alternative in {@link LightningParser#expressaoUnica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoID(LightningParser.ExpressaoIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressaoMultiplicativa}
	 * labeled alternative in {@link LightningParser#expressaoUnica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoMultiplicativa(LightningParser.ExpressaoMultiplicativaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressaoMultiplicativa}
	 * labeled alternative in {@link LightningParser#expressaoUnica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoMultiplicativa(LightningParser.ExpressaoMultiplicativaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressaoAditiva}
	 * labeled alternative in {@link LightningParser#expressaoUnica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAditiva(LightningParser.ExpressaoAditivaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressaoAditiva}
	 * labeled alternative in {@link LightningParser#expressaoUnica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAditiva(LightningParser.ExpressaoAditivaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LightningParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(LightningParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LightningParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(LightningParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inteiro}
	 * labeled alternative in {@link LightningParser#numeroLiteral}.
	 * @param ctx the parse tree
	 */
	void enterInteiro(LightningParser.InteiroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inteiro}
	 * labeled alternative in {@link LightningParser#numeroLiteral}.
	 * @param ctx the parse tree
	 */
	void exitInteiro(LightningParser.InteiroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code real}
	 * labeled alternative in {@link LightningParser#numeroLiteral}.
	 * @param ctx the parse tree
	 */
	void enterReal(LightningParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code real}
	 * labeled alternative in {@link LightningParser#numeroLiteral}.
	 * @param ctx the parse tree
	 */
	void exitReal(LightningParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by {@link LightningParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao(LightningParser.InstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LightningParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao(LightningParser.InstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LightningParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(LightningParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LightningParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(LightningParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LightningParser#listaDeInstrucoes}.
	 * @param ctx the parse tree
	 */
	void enterListaDeInstrucoes(LightningParser.ListaDeInstrucoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LightningParser#listaDeInstrucoes}.
	 * @param ctx the parse tree
	 */
	void exitListaDeInstrucoes(LightningParser.ListaDeInstrucoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LightningParser#instrucaoSE}.
	 * @param ctx the parse tree
	 */
	void enterInstrucaoSE(LightningParser.InstrucaoSEContext ctx);
	/**
	 * Exit a parse tree produced by {@link LightningParser#instrucaoSE}.
	 * @param ctx the parse tree
	 */
	void exitInstrucaoSE(LightningParser.InstrucaoSEContext ctx);
	/**
	 * Enter a parse tree produced by {@link LightningParser#instrucaoVazia}.
	 * @param ctx the parse tree
	 */
	void enterInstrucaoVazia(LightningParser.InstrucaoVaziaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LightningParser#instrucaoVazia}.
	 * @param ctx the parse tree
	 */
	void exitInstrucaoVazia(LightningParser.InstrucaoVaziaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LightningParser#fdi}.
	 * @param ctx the parse tree
	 */
	void enterFdi(LightningParser.FdiContext ctx);
	/**
	 * Exit a parse tree produced by {@link LightningParser#fdi}.
	 * @param ctx the parse tree
	 */
	void exitFdi(LightningParser.FdiContext ctx);
}