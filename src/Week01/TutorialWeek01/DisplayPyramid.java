package Week01.TutorialWeek01;

import java.util.Scanner;

public class DisplayPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int rows = scanner.nextInt();

        displayPyramid(rows);
    }

    static void displayPyramid(int rows) {
        if (rows < 1 || rows > 15) {
            System.out.print("Invalid number of lines: Should be an integer from 1 to 15.");
        }

        for (int i = 1; i < rows + 1; i++) {
            for (int s = 0; s < rows - i; s++) {
                System.out.print("  ");
            }

            int indent = i;
            while (indent < rows) {
                System.out.print("  ");
                indent++;
            }

            //Print left side --> center
            for (int l = i; l > 1; l--) {
                if (l < 10) {
                    System.out.print("   ");
                } else if (l < 100) {
                    System.out.print("  ");
                } else {
                    System.out.print(" ");
                }
                System.out.print(l);
            }

            //Print Center --> right side
            for (int r = 1; r <= i; r++) {
                if (r < 10) {
                    System.out.print("   ");
                } else if (r < 100) {
                    System.out.print("  ");
                } else {
                    System.out.print(" ");
                }
                System.out.print(r);
            }

            System.out.println();
        }
    }
}
