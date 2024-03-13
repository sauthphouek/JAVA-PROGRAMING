import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter number 1"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter number 2"));

        JOptionPane.showMessageDialog(
                null,
                "Number 1: " + ClassOperations.info(num1) +
                "\nNumber 2: " + ClassOperations.info(num2) +
                "\nAddition: " + ClassOperations.add(num1, num2) +
                "\nSubtraction: " + ClassOperations.subtract(num1, num2) +
                "\nMultiplication: " + ClassOperations.multiply(num1, num2) +
                "\nDivision: " + ClassOperations.divide(num1, num2)
        );

    }
}