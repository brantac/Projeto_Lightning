package lightning;

import lightning.sint.LightningLexer;
import lightning.sint.LightningParser;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.io.IOException;

public class Light {
  public static void main(String[] args) throws IOException {

    if (args.length == 0) {
      args = new String[] { "test/cenario-01.light" };
    }
    System.out.println("Interpretando " + args[0]);

    // Análise léxica
    LightningLexer lexer = new LightningLexer(new ANTLRFileStream(args[0]));
    CommonTokenStream tokens = new CommonTokenStream(lexer);

    // Análise sintática
    LightningParser parser = new LightningParser(tokens);
    LightningParser.DeclaracaoContext arvore = parser.declaracao();

    // Análise semântica
    RegrasLightning semantico = new RegrasLightning();
    Integer resultado = semantico.visit(arvore);
    System.out.printf("? %s\n", resultado);
  }
}
