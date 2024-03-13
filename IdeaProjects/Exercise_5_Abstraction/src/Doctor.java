import java.util.Scanner;

public class Doctor extends Person{
    Scanner scanner = new Scanner(System.in);
    Doctor(int weight, int height) {
        super(weight, height);
    }
    // show weight
    void showWeight(int weight) {
        System.out.println("Doctor's weight is: " + weight);
    }
    // show height
    void showHeight(int height) {
        System.out.println("Doctor's height is: " + height);
    }
    // doctor input
    void doctorInput() {
        System.out.print("Input doctor's weight : ");
        weight = scanner.nextInt();
        System.out.print("Input doctor's height : ");
        height = scanner.nextInt();
    }
    // doctor show
    void doctorShow() {
        System.out.println("Doctor Information : ");
        showWeight(weight);
        showHeight(height);
    }

}
