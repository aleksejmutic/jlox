import java.util.ArrayList;
import java.util.List;

/**
 * The lexical analyzer (scanner) for the Lox language.
 * <p>
 * The lexer takes raw source code as a string and breaks it into a sequence
 * of lexical tokens. The current implementation is a placeholder and does not
 * yet perform real token scanning.
 */
public class Lexer {

    /** Raw source code provided to the lexer. */
    private final String sourceCode;

    /** Collected list of tokens produced during scanning. */
    private final List<Token> tokens = new ArrayList<>();

    /**
     * Creates a new lexer for the given source code.
     *
     * @param sourceCode Lox code to be scanned.
     */
    public Lexer(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    /**
     * Scans the source code and returns a list of tokens.
     * <p>
     * The current implementation simply prints any tokens that already
     * exist in the internal list (which is empty for now).
     *
     * @return List of scanned tokens (empty until scanning is implemented).
     */
    public List<Token> scanTokens(){
        for (Token token : tokens) {
            System.out.println(token);
        }
        return tokens;
    }
}
