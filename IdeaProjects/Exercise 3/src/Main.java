import javax.swing.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // system input and output
        Scanner scanner = new Scanner(System.in);
        int number;
        String result = "";
        int sum = 0;
        // do while if the number 0<=number<=10
        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
        } while (number <= 0 || number > 10);

        // for loop

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 1) {
                result = result + i;
                sum += i;
                if (i < number) {
                    result = result + " + ";
                }

            }

        }
        // how many types of loop
        // for loop
        // while loop
        // do while loop
        // for each loop


        System.out.println(result + " = " + sum);
    }
}