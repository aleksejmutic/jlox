import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * The Lox interpreter.
 * <p>
 * This class decides whether it should run a script from a file
 * or launch the interactive prompt (REPL). It also provides utility methods
 * for running code from various sources.
 */
public class Lox {
    /**
     * Entry point for starting the interpreter.
     * <p>
     * Based on the number of arguments:
     * <ul>
     *     <li>0 arguments → start the REPL</li>
     *     <li>1 argument → treat it as a script file and run it</li>
     *     <li>>1 arguments → print usage error and exit</li>
     * </ul>
     *
     * @param args Command-line arguments passed to the program.
     * @throws IOException If a script file cannot be read.
     */
    public static void start(String[] args) throws IOException {
        if(args.length > 1){
            System.out.println("Usage: jlox[script]");
            System.exit(64);
        } else if (args.length == 1) {
            runFile(args[0]);
        } else  {
            runPrompt();
        }
    }

    /**
     * Executes Lox code loaded from a file.
     *
     * @param filePath Path to the script file.
     * @throws IOException If reading the file fails.
     */
    private static void runFile(String filePath) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get(filePath));
        run(new String(bytes, Charset.defaultCharset()));
    }

    /**
     * Runs the interactive prompt, a REPL(Read-Evaluate-Print Loop).
     * <p>
     * Continuously reads lines from standard input, executes them,
     * and prints results until the user exits or until input ends.
     *
     * @throws IOException If reading input fails.
     */
    private static void runPrompt() throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        while (true) {
            System.out.print("> ");
            String line = reader.readLine();
            if (line == null) break;
            run(line);
        }
    }

    /**
     * Runs the lexer.
     * <p>
     * Takes source code as a string, sends it to the lexer,
     * and begins interpreting the code.
     *
     * @param sourceCode Lox source code to be run.
     * @throws IOException If an error occurs in later stages (unused for now).
     */
    private static void run(String sourceCode) throws IOException {
        Lexer lexer = new Lexer(sourceCode);
        lexer.scanTokens();
    }
}
