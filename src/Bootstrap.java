import java.io.IOException;

/**
 * Entry point for the Lox interpreter.
 * <p>
 * This class only contains the {@code main} method, which delegates
 * execution to the Lox interpreter. Keeping this class small ensures
 * that the interpreter logic remains isolated inside {@link Lox}.
 */
public class Bootstrap {

    /**
     * Program entry point. Passes command-line arguments to
     * {@link Lox#start(String[])} to start the interpreter.
     *
     * @param args Command-line arguments. Either empty (REPL mode),
     *             or one argument specifying a script file path.
     * @throws IOException If reading a file fails.
     */
    public static void main(String[] args) throws IOException {
        Lox.start(args);
    }
}
