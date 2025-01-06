package Week01.TutorialWeek01;

import java.util.Scanner;

public class PyramidPatterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number of rows: ");
        int rows = scanner.nextInt();
        if (rows < 1 || rows > 9) {
            System.out.println("Invalid number of rows: Should be an integer from 1 to 9.");
            return;
        }

        patternA(rows);
        patternB(rows);
        patternC(rows);
        patternD(rows);
    }

    static void patternA(int rows) {
        System.out.println("Pattern A");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void patternB(int rows) {
        System.out.println("Pattern B");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void patternC(int rows) {
        System.out.println("Pattern C");
        for (int i = 1; i <= rows; i++) {
            for (int s = 0; s < rows - i; s++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void patternD(int rows) {
        System.out.println("Pattern D");
        for (int i = rows; i >= 1; i--) {
            for (int s = 0; s < rows - i; s++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
