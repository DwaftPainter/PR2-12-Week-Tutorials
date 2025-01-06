package Week01.TutorialWeek01;

import java.util.Scanner;

public class NumbersPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int rows = scanner.nextInt();

        printNumbersPyramid(rows);
    }

    static void printNumbersPyramid(int rows) {
        if (rows < 3 || rows > 10) {
            System.out.print("Invalid number of rows: Should be an integer from 3 to 10.");
            return;
        }

        int center = 1;
        for (int i = 1; i <= rows; i++) {
            for (int s = 0; s < rows - i; s++) {
                System.out.print("  ");
            }

            int indent = i;
            while (indent < rows) {
                System.out.print("  ");
                indent++;
            }

            //Print left side --> center
            for (int l = 1; l < center; l = l * 2) {
                if (l < 10) {
                    System.out.print("   ");
                } else if (l < 100) {
                    System.out.print("  ");
                } else {
                    System.out.print(" ");
                }
                System.out.print(l);
            }

            //Print center --> right side
            for (int r = center; r >= 1; r = r / 2) {
                if (r < 10) {
                    System.out.print("   ");
                } else if (r < 100) {
                    System.out.print("  ");
                } else {
                    System.out.print(" ");
                }
                System.out.print(r);
            }

            //Update center value
            center *= 2;

            System.out.println();
        }
    }
}
