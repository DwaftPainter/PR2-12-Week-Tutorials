package Week01.TutorialWeek01;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        System.out.println(decimalToBinary(decimal));
    }

    static String decimalToBinary(int decimal) {
        if (decimal < 0) {
            return "Invalid decimal: Decimal should be an integer that is positive and smaller than or equal to 2147483647.";
        } else if (decimal == 0) {
            return "0";
        } else if (decimal == 1) {
            return "1";
        }

        char binary = (char) (decimal % 2 + '0');

        return decimalToBinary(decimal / 2) + binary;
    }
}
