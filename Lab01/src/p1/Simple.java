package p1;

//1. simple (Why do you even have to change the name of the file in this case?)
//Legal (Java is case sensitive) - But not a good choice, since
//classes conventionally begin with a capital letter

//2. SimpleProgram
//Legal - Is a good choice since each separate word is clearly
//denoted by a starting capital letter, though may be a bit too
//long.

//3. 1 Simple
//Illegal - Begins with a number and has a space inside

//4. _Simple_
//Illegal - Underscore is allowed anywhere BUT the first letter

//5. *Simple*
//Illegal - "*" is an illegal class name character

//6. $123_45
//Legal - A terrible name since it tells us nothing about what
//it does and is hard to remember.

//7. Simple!
//Illegal - "!" is an illegal class name character

// ********************************************
// Simple.java
//
// Print a simple message about Java.
//
// ********************************************
public class Simple
{
    public static void main (String[] args)
    {
        System.out.println ("Java rocks!!");
    }
}