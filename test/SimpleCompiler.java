import org.antlr.v4.runtime.*;
import java.io.*;

/**
 * Created by 100490143 on 4/10/2016.
 */
public class SimpleCompiler {
    public static void main(String[] args) throws Exception {
	if(args.length != 1) {
            System.err.println("Error: Invalid use of command line argument, expected file name");
            System.exit(0);
        }

        FileInputStream in = new FileInputStream(args[0]);
        ANTLRInputStream input = new ANTLRInputStream(in);
        SimpleLexer lex = new SimpleLexer(input);
        CommonTokenStream tok = new CommonTokenStream(lex);
        SimpleParser parser = new SimpleParser(tok);

        parser.start();
    }
}
