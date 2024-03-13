// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int a = 25, b = 17, c, d ;
        c = a * b ;
        d = c - 425;
        // 1. what the exception will be occurred?
        // answer: ArithmeticException

        // 2. write the code to handle the above exception
        try {
            int result = d / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }
}

// what is abstract class?
// answer: Abstract class is a class that can't be instantiated.
// It is used to provide abstraction.
// It can have abstract and non-abstract methods.
// It needs to be extended and its method implemented.

// what is interface?
// answer: Interface is a blueprint of a class.
// It has static constants and abstract methods.

// what is the difference between abstract class and interface?
// answer: Abstract class can have abstract and non-abstract methods.
// Interface can have only abstract methods.
// Abstract class doesn't support multiple inheritance.
// Interface supports multiple inheritance.

// What is method overloading?
// answer: Method overloading is a feature that allows a class to have
// more than one method having the same name,

// What is method overriding?
// answer: Method overriding is a feature that allows a subclass or child class

// What is the difference between method overloading and method overriding?
// answer: Method overloading is a feature that allows a class to have
// more than one method having the same name,
// if their argument lists are different.
// Method overriding is a feature that allows a subclass or child class
// to provide a specific implementation of a method that is already provided
// by one of its super-classes or parent classes.


// Talk about Object-Oriented Programming
// answer: Object-Oriented Programming is a methodology or paradigm to design a program


