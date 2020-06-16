public class RegrasLightning
    extends LightningBaseVisitor<Integer> {
        @Override
        public Integer visitExpressaoAditiva(LightningParser.ExpressaoAditivaContext ctx) {
            String a = ctx.expressaoUnica(0).getText();
            String b = ctx.expressaoUnica(1).getText();
            Integer resultado = Integer.parseInt(a) + Integer.parseInt(b);
            // System.out.println(result);
            return resultado;
        }
    }