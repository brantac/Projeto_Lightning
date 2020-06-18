package lightning;

import lightning.sint.LightningBaseVisitor;
import lightning.sint.LightningParser;

public class RegrasLightning extends LightningBaseVisitor<Integer> {
    // Italo 1: visita a partir da raiz
    @Override
    public Integer visitDeclaracao(LightningParser.DeclaracaoContext ctx) {
        return visit(ctx.listaDeDeclaracaoDeVariaveis());
    }

    @Override
    public Integer visitExpressaoAditiva(LightningParser.ExpressaoAditivaContext ctx) {
        int a = visit(ctx.expressaoUnica(0));
        int b = visit(ctx.expressaoUnica(1));
        // Italo 2: decidir qual operação será realizada
        String op = ctx.op.getText();
        switch (op.charAt(0)) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            default:
                throw new IllegalArgumentException("Operador ilegal " + op);
        }
    }

    // Italo 3: reconhece o lexeme correspondente a um numero
    @Override
    public Integer visitInteiro(LightningParser.InteiroContext ctx) {
        String v = ctx.InteiroLiteral().getText();
        return Integer.parseInt(v);
    }

}