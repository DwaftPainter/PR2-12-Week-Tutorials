package Week01.TutorialWeek01Official;

import java.util.Scanner;

public class ISBN13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first 12 digits of an ISBN-13 as a string: ");
        String digits = scanner.next();

        if (digits.length() != 12) {
            System.out.print(digits + " is an invalid input");
            return;
        }

        int checkSum = 0;
        int sum = 0;
        for (int i = 0; i < digits.length(); i++) {
            //Check if digits contain any non-numeric character
            if (!Character.isDigit(digits.charAt(i))) {
                System.out.print(digits + " is an invalid input");
                return;
            }

            if (i % 2 != 0) {
                sum += 3 * (digits.charAt(i) - '0');
            } else {
                sum += digits.charAt(i) -'0';
            }
        }

        checkSum = 10 - sum % 10;
        if (checkSum == 10) {
            digits += "0";
        } else {
            digits += checkSum;
        }

        System.out.printf("The ISBN-13 number is %s", digits);
    }
}
