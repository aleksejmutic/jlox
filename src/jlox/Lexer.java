package jlox;

import java.util.ArrayList;
import java.util.List;
import jlox.TokenType;

/**
 * The lexical analyzer (scanner) for the jlox.Lox language.
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

    private int start = 0;
    private int current = 0;
    private int line = 1;

    /**
     * Creates a new lexer for the given source code.
     *
     * @param sourceCode jlox.Lox code to be scanned.
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
    public List<Token> scanTokens() {
        while (!isAtEnd()) {
            start = current;
            scanToken();
        }

        tokens.add(new Token(TokenType.EOF, "", null, line));
        return tokens;
    }

    /**
     * Scans one token at a time, and assigns its type.
     */
    private void scanToken() {
        char c = advance();
        switch(c) {
            case '(': addToken(TokenType.LEFT_PAREN); break;
            case ')': addToken(TokenType.RIGHT_PAREN); break;
            case '{': addToken(TokenType.LEFT_BRACE); break;
            case '}': addToken(TokenType.RIGHT_BRACE); break;
            case ',': addToken(TokenType.COMMA); break;
            case '.': addToken(TokenType.DOT); break;
            case '-': addToken(TokenType.MINUS); break;
            case '+': addToken(TokenType.PLUS); break;
            case ';': addToken(TokenType.SEMICOLON); break;
            case '*': addToken(TokenType.STAR); break;
            default:
                Lox.error(line, "Unexpected character.");
                break;
        }
    }

    /**
     * Checks if the Lexer is at the end of the given source code file.
     */
    private boolean isAtEnd() {
        return current >= sourceCode.length();
    }

    /**
     * Advances the current position by one and returns the character that was at the current position
     * before advancing.
     *
     * @return the current character in the source code, then moves the pointer to the next character.
     */
    private char advance() {
        current++;
        return sourceCode.charAt(current - 1);
    }

    private void addToken(TokenType type) {
        addToken(type, null);
    }

    private void addToken(TokenType type, Object literal) {
        String text = sourceCode.substring(start, current);
        tokens.add(new Token(type, text, literal, line));
    }
}
