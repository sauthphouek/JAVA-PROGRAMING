import javax.swing.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // subjects: English, Math, Computer, History, and Khmer
        String[] subjects = {
                "English",
                "Math",
                "Computer",
                "History",
                "Khmer",
        };

        System.out.println("Input the following score :");
        System.out.println("---------------------------");
        double totalScore = 0.00 ;
        String inputResult = "";
        double average = 0.00;
        for (String subject: subjects) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input " + subject + "     :   " );
            double inputScore = scanner.nextDouble() ;
            inputResult = inputResult + subject + "          : " + inputScore + "\n";
            totalScore += inputScore;
        }
        average = totalScore / subjects.length;
        System.out.println("---------------------------");
        System.out.println();
        System.out.println(inputResult);
        System.out.println("\t\t\t-----------");
        System.out.println("Total\t\t\t:" + totalScore);
        System.out.println("Average\t\t\t:" + average);
        System.out.println(printStatus(average));
    }

    public  static String  printStatus(double average) {
        String status = "He/She is " ;
        if (average < 50) {
            status +=  "poor!";
        } else if (average >= 50 && average < 65) {
            status += "fair!";
        } else if (average >= 65 && average <75) {
            status += "fairly good!";
        } else if (average >= 75 && average < 85) {
            status += "good!";
        } else if (average >=85 && average < 95) {
            status += "very good!";
        } else {
            status += "excellent!";
        }
        return status;
    }

}

