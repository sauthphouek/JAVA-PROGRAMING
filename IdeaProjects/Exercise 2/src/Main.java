import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String number1 = JOptionPane.showInputDialog("Input num1: ");
        String number2 = JOptionPane.showInputDialog("Input num2: ");
        String operator = JOptionPane.showInputDialog("Input operator: ");

        double number1ToDouble = Double.parseDouble(number1);
        double number2ToDouble = Double.parseDouble(number2);
        double result = 0.00;

        switch (operator.trim()) {
            case "+":
                result = number1ToDouble + number2ToDouble;
                break;
            case "-":
                result = number1ToDouble - number2ToDouble;
                break;
            case "*":
                result = number1ToDouble * number2ToDouble;
                break;
            case "/":
                result = number1ToDouble / number2ToDouble;
                break;
            default:
                break;
        }
        JOptionPane.showMessageDialog(null, number1 + operator.trim() + number2 + " = " + result);

    }
}