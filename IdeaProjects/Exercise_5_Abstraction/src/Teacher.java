import java.util.Scanner;
public class Teacher extends  Person {
        Scanner scanner = new Scanner(System.in);
        Teacher(int weight , int height) {
            super(weight, height);
        }
    // show weight
        void showWeight(int weight) {
            System.out.println("Teacher's weight is: " + weight);
        }
        // show height
        void showHeight(int height) {
            System.out.println("Teacher's height is: " + height);
        }
        // teacher input
        void teacherInput() {
            System.out.print("Input teacher's weight : ");
            weight = scanner.nextInt();
            System.out.print("Input teacher's height : ");
            height = scanner.nextInt();
        }
        // teacher show
        void teacherShow() {
            System.out.println("Teacher Information : ");
            showWeight(weight);
            showHeight(height);

        }

}
