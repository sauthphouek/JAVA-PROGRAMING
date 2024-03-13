import java.text.DecimalFormat;
import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
//    public static void main(String[] args) {
//        Scanner scanner1 = new Scanner(System.in);
//        Scanner scanner2 = new Scanner(System.in);
//
//        double oldNumber , newNumber,usedNumber, totalPrice;
//
//        // decimal separator is a dot (.)
//
//        do {
//            System.out.print("Enter the old number: ");
//            oldNumber = scanner1.nextDouble();
//            System.out.print("Enter the new number: ");
//            newNumber = scanner2.nextDouble();
//
//        } while (oldNumber > newNumber);
//        usedNumber = newNumber - oldNumber;
//        DecimalFormat df = new DecimalFormat("#.##");
//        double totalKw = Double.parseDouble(df.format(usedNumber));
//
//        System.out.println("-------------------------------");
//        // 1kw = 0.08$ if used < 50kw
//        // 1kw = 0.12$ if used >= 50kw and < 100kw
//        // 1kw = 0.15$ if used >= 100kw and < 500kw
//        // 1kw = 0.20$ if used >= 500kw and < 1000kw
//        // 1kw = 0.25$ if used >= 1000kw
//        if (totalKw < 50) {
//            totalPrice = totalKw * 0.08;
//        } else if (totalKw >= 50 && totalKw < 100) {
//            totalPrice = totalKw * 0.12;
//        } else if (totalKw >= 100 && totalKw < 500) {
//            totalPrice = totalKw * 0.15;
//        } else if (totalKw >= 500 && totalKw < 1000) {
//            totalPrice = totalKw * 0.20;
//        } else {
//            totalPrice = totalKw * 0.25;
//        }
//
//        System.out.println(totalKw + "kw, " + "we paid: " + totalPrice + "$");
//    }
//    public static void main(String[] args) {
//    Scanner scan = new Scanner(System.in);
//    double oldNum, newNum, usedNum, paid;
//    do {
//        System.out.print("input old number : ");
//        oldNum = scan.nextDouble();
//        System.out.print("input new number : ");
//        newNum = scan.nextDouble();
//    }while(oldNum>newNum);
//    usedNum = newNum-oldNum;
//    System.out.println("---------------------\n");
//    if(usedNum < 50) {
//        paid = usedNum * 0.08;
//    }
//    else if(usedNum>=50 && usedNum<100) {
//        paid = (usedNum-50)*0.12 + (50*0.08);
//    }
//    else if(usedNum>=100 && usedNum<500) {
//        paid = (usedNum-100)*0.15 + (50*0.08) + (50*0.12);
//    }
//    else if(usedNum>=500 && usedNum<1000) {
//        paid = (usedNum-500)*0.20 + (50*0.08) + (50*0.12) +
//                (400*0.15);
//    }
//    else {
//        paid = (usedNum-1000)*0.25 + (50*0.08) + (50*0.12) +
//                (400*0.15) + (500*0.20);
//    }
//    System.out.println(usedNum + "kw, we paid : " + paid +
//            "$");
//}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;
        do {
            System.out.print("Enter a number: ");
            inputNumber = scanner.nextInt();
        } while ( inputNumber < 1 || inputNumber > 10);

        System.out.println("-------------------------------");
        for (int i = 1; i <= inputNumber; i++) {
            if (i % 2 == 0 && i < inputNumber) {
                System.out.print(i +  ");
            }
        }
    }
}
