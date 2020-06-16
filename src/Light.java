import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.io.IOException;

public class Light {
  public static void
  main(String[] args) throws IOException {
    String entrada = String.join(" ", args);
    System.out.println(entrada);
    

    // Análise léxica
    LightningLexer lexer =
      new LightningLexer(CharStreams.fromString(entrada));
    CommonTokenStream tokens = new CommonTokenStream(lexer);

    // Análise sintática
    LightningParser parser = new LightningParser(tokens);
    LightningParser.DeclaracaoContext arvore = parser.declaracao();

    // Análise semântica
    RegrasLightning semantico = new RegrasLightning();
    Integer resultado = semantico.visit(arvore);
    System.out.println(resultado);
  }
}
