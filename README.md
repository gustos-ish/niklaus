# niklaus
Introduction to the compilation of a programming language

A little project to understand how a program is compiled.
Therefore, with this project we created a language called Niklaus.

We created our grammar with ANTLR to generate AST trees of the files of our programming language.
Then we implemented the methods to convert program files in assembly code for a micro-processor seen in class.

Example of a Niklaus program syntax.

```java
program NameOfProgam;
var variable1, variable2;  // list of variables used in the program
{
    // body of the program (bloc)
}
```
Instructions recognized and details
* read
* write
* affectation
* while loop
* condition
* variables are only ints
* comparisons must be handled for while loop and condition instructions

**for more details cf Niklaus.g**
