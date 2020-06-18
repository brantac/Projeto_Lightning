// Generated from antlr4/Lightning.g4 by ANTLR 4.8
package lightning.sint;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LightningParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LightningVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LightningParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(LightningParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LightningParser#listaDeDeclaracaoDeVariaveis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaDeDeclaracaoDeVariaveis(LightningParser.ListaDeDeclaracaoDeVariaveisContext ctx);
	/**
	 * Visit a parse tree produced by {@link LightningParser#tipoDaVariavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoDaVariavel(LightningParser.TipoDaVariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link LightningParser#declaracaoDaVariavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoDaVariavel(LightningParser.DeclaracaoDaVariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link LightningParser#atribuivel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuivel(LightningParser.AtribuivelContext ctx);
	/**
	 * Visit a parse tree produced by {@link LightningParser#expressaoEmSequencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoEmSequencia(LightningParser.ExpressaoEmSequenciaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressaoLiteral}
	 * labeled alternative in {@link LightningParser#expressaoUnica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoLiteral(LightningParser.ExpressaoLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressaoDeIgualdade}
	 * labeled alternative in {@link LightningParser#expressaoUnica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoDeIgualdade(LightningParser.ExpressaoDeIgualdadeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressaoDeRelacao}
	 * labeled alternative in {@link LightningParser#expressaoUnica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoDeRelacao(LightningParser.ExpressaoDeRelacaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressaoDeAtribuicao}
	 * labeled alternative in {@link LightningParser#expressaoUnica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoDeAtribuicao(LightningParser.ExpressaoDeAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressaoID}
	 * labeled alternative in {@link LightningParser#expressaoUnica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoID(LightningParser.ExpressaoIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressaoMultiplicativa}
	 * labeled alternative in {@link LightningParser#expressaoUnica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoMultiplicativa(LightningParser.ExpressaoMultiplicativaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressaoAditiva}
	 * labeled alternative in {@link LightningParser#expressaoUnica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoAditiva(LightningParser.ExpressaoAditivaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LightningParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(LightningParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inteiro}
	 * labeled alternative in {@link LightningParser#numeroLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteiro(LightningParser.InteiroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code real}
	 * labeled alternative in {@link LightningParser#numeroLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal(LightningParser.RealContext ctx);
	/**
	 * Visit a parse tree produced by {@link LightningParser#instrucao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucao(LightningParser.InstrucaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LightningParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(LightningParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LightningParser#listaDeInstrucoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaDeInstrucoes(LightningParser.ListaDeInstrucoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LightningParser#instrucaoSE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucaoSE(LightningParser.InstrucaoSEContext ctx);
	/**
	 * Visit a parse tree produced by {@link LightningParser#instrucaoVazia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucaoVazia(LightningParser.InstrucaoVaziaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LightningParser#fdi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFdi(LightningParser.FdiContext ctx);
}