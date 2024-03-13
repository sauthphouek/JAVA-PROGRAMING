// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {


        String attendance = JOptionPane.showInputDialog("Input attendance: ");

        String midterm = JOptionPane.showInputDialog("Input midterm: ");

        String assignment = JOptionPane.showInputDialog("Input assignment: ");

        String finalExam = JOptionPane.showInputDialog("Input final exam: ");

        String  message = "Student Result:";
                message += "\n-------------";
                message += "\nAttendance: " + attendance;
                message += "\nMidterm: " + midterm;
                message += "\nAssignment: " + assignment;
                message += "\nFinal Exam: " + finalExam;

                double  totalScore = (Double.parseDouble(attendance));
                        totalScore += (Double.parseDouble(midterm));
                        totalScore += (Double.parseDouble(assignment));
                        totalScore += (Double.parseDouble(finalExam));

                        message += "\nTotal Score: " + totalScore;

                        message += totalScore >= 50 ? "\n So, He/She is passed." : "\n So, He/She is failed.";

                        JOptionPane.showMessageDialog(null, message);

    }
}