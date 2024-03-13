
// create interface name MyInterface with method area
interface MyInterface {
    public void area();
}
class Rectangle implements MyInterface {
    int length, width;
    public void area() {
        int area = length * width;
        System.out.println("Area of rectangle is: " + area);
    }
}
class Triangle implements MyInterface {
    int BASE, HEIGHT;
    public void area() {
        double area = (double) (BASE * HEIGHT) / 2;
        System.out.println("Area of triangle is: " + area);
    }
}
class PolygonDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.length = 10;
        rectangle.width = 20;
        rectangle.area();
        Triangle triangle = new Triangle();
        triangle.BASE = 10;
        triangle.HEIGHT = 20;
        triangle.area();
    }
}
// what is array in java and give the example of array
// answer: An array is a collection of similar type of elements that have a contiguous memory location.
//
//import java.util.Scanner;
//// class polygon
//abstract  class Polygon {
//    double width, height;
//    Polygon(double width, double height) {
//        this.width = width;
//        this.height = height;
//    }
//    abstract void showWidth(double width);
//    abstract void showHeight(double height); ;
//}
//// class Rectangle
//class Rectangle extends Polygon {
//    Scanner scanner = new Scanner(System.in);
//    Rectangle(double width, double height) {
//        super(width, height);
//    }
//    @Override
//    void showWidth(double width) {
//        // print the width of rectangle
//        System.out.println("Rectangle's width is " + width);
//    }
//    @Override
//    void showHeight(double height) {
//        // print the height of rectangle
//        System.out.println("Rectangle's height is " + height);
//    }
//    // method rectInput, rectShow method
//    void rectInput() {
//        System.out.print("Input rectangle's width : ");
//        width = scanner.nextInt();
//        System.out.print("Input rectangle's height : ");
//        height = scanner.nextInt();
//    }
//    void rectShow() {
//        // print the area of rectangle
//        System.out.println("Rectangle Information : ");
//        showWidth(width);
//        showHeight(height);
//    }
//}
//class Triangle extends Polygon {
//    Scanner scanner = new Scanner(System.in);
//    Triangle(double width, double height) {
//        super(width, height);
//    }
//    @Override
//    void showWidth(double width) {
//        // print the width of rectangle
//        System.out.println("Triangle's width is " + width);
//    }
//    @Override
//    void showHeight(double height) {
//        // print the height of rectangle
//        System.out.println("Triangle's height is " + height);
//    }
//    void triInput() {
//        System.out.print("Input triangle's width : ");
//        width = scanner.nextInt();
//        System.out.print("Input triangle's height : ");
//        height = scanner.nextInt();
//    }
//    void triShow() {
//        // print the area of rectangle
//        System.out.println("Triangle Information : ");
//        showWidth(width);
//        showHeight(height);
//    }
//}


// principle of oop
// answer: The four principles of object-oriented programming are encapsulation, inheritance, polymorphism, and abstraction.
// explain the concept of encapsulation
// answer: Encapsulation is the technique of making the fields in a class private and providing access to the fields via public methods.
// explain the concept of inheritance
// answer: Inheritance is a mechanism in which one class acquires the property of another class.
// explain the concept of polymorphism
// answer: Polymorphism is the ability of a variable, function, or object to take on multiple forms.
// explain the concept of abstraction
// answer: Abstraction is the concept of object-oriented programming that "shows" only essential attributes and "hides" unnecessary information.

// what is the difference between class and object
// answer: A class is a blueprint for creating objects, and an object is an instance of a class.
// an object is a real-world entity, whereas a class is a group of similar objects.