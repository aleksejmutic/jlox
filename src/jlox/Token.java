package jlox;

/**
 * Represents a lexical token in the jlox.Lox language.
 * <p>
 * This class currently has no fields or behavior. It will be expanded later
 * to store token type, lexeme, literal value, and source code position.
 */
public class Token {
    final TokenType type;
    final String lexeme;
    final Object literal;
    final int line;

    public Token(TokenType type, String lexeme, Object literal, int line) {
        this.type = type;
        this.lexeme = lexeme;
        this.literal = literal;
        this.line= line;
    }

    public String toString(){
        return type + " " + lexeme + " " + literal;
    }
}
