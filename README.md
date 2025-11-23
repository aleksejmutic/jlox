# jlox

![Java](https://img.shields.io/badge/Language-Java-red) ![Status](https://img.shields.io/badge/Status-Learning-blue)

This repository contains my implementation of the **Lox programming language** interpreter, inspired by the book *[Crafting Interpreters](https://craftinginterpreters.com/)* by Bob Nystrom. This project is a personal learning exercise where I follow the book's guidance and also experiment with my own modifications.

---

## Project Overview

- **Goal:** Implement the Lox interpreter in Java while practicing programming language concepts.  
- **Language:** Java  
- **Structure:** 
  - `Bootstrap.java` — Entry point for the interpreter.  
  - `Lexer.java` — Tokenizes input source code.  
  - `Token.java` — Represents tokens.  
  - `Lox.java` — Core interpreter logic (currently in progress).  

---

## Lox Syntax Overview

Lox is a small, dynamically typed language. Some core features:

### Variables
```lox
var x = 10;
var y = "hello";
