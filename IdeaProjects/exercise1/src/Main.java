import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Note: System.in => input from keyboard, System.out => output to screen
        // Enter first number
        System.out.print("Enter first number: ");
        int num_1 = scanner.nextInt();
        // Enter second number
        System.out.print("Enter second number: ");
        int num_2 = scanner.nextInt();

        System.out.println("Calculation of two numbers (int) : number1 = " + num_1 + ", number2 = " + num_2);
        System.out.println("--------------------------------------------------------------");
        System.out.println("Sum of two numbers (int) : " + (num_1 + num_2));
        System.out.println("Subtraction of two numbers (int) : " + (num_1 - num_2));
        System.out.println("Multiplication of two numbers (int) : " + (num_1 * num_2));
        System.out.println("Division of two numbers (int) : " + (num_1 / num_2));

    }
}