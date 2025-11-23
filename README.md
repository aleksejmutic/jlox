# The Lox Interpreter

Welcome to my test Lox interpreter project! This repository contains the code for the Lox interpreter written in Java, inspired by the book **[*Crafting Interpreters*](https://craftinginterpreters.com/)** by Robert Nystrom.

##  Purpose

I am currently reading *Crafting Interpreters* to learn **how programming languages, interpreters, and compilers are made**. This project exists to learn the concepts presented in the book.

The goal is to **build a working interpreter from scratch** while experimenting with new ideas and implementing my own variations on the language syntax and semantics.

## 🛠 Features (Planned)

- Lexical analysis (tokenizer / lexer)
- Parsing source code into an **AST (Abstract Syntax Tree)**
- Interpreter to execute Lox programs
- Optional syntax changes
- REPL mode for interactive programming

##  Getting Started

To run the skeleton project:

1. **Clone the repository**:
   ```bash
   git clone https://github.com/username/jlox.git
   cd jlox
   ```

2. **Compile the project**:
   ```bash
   javac -d out src/*.java
   ```

3. **Run the interpreter**:
   ```bash
   java -cp out Bootstrap
   ```
   - Pass a script file as an argument to run a file.
   - Run without arguments to enter REPL mode.

##  Notes

- This project is a **learning exercise** based on *Crafting Interpreters*.
- I'm experimenting with Java and interpreter design, so things may evolve as I continue reading and implementing.
  
##  References

- [Crafting Interpreters](https://craftinginterpreters.com/) by Robert Nystrom
- **Lox language**: the language defined in the book for learning interpreter construction


This project is actively evolving as I read the book and implement more features. Expecting updates to the lexer, parser, and interpreter as I progress.
