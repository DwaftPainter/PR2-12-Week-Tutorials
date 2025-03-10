package Week08.TutorialWeek08;

import java.util.Scanner;

public class PyramidGenerator {
    // Attributes
    private int row;

    // Constructors
    public PyramidGenerator(int row) throws Exception {
        validateRow(row);
        this.row = row;
    }

    // Another Methods
    public void printHalfRightPyramid() {
        int center = 1;
        for (int i = 1; i <= row; i++) {

            //Print center --> right side
            for (int r = center; r >= 1; r = r / 2) {
                System.out.print(r);
                if (r < 10) {
                    System.out.print("   ");
                } else if (r < 100) {
                    System.out.print("  ");
                } else {
                    System.out.print(" ");
                }
            }

            //Update center value
            center *= 2;

            System.out.println();
        }
    }

    public void printHalfLeftPyramid() {
        int center = 1;
        for (int i = 1; i <= row; i++) {
            for (int s = 0; s < row - i; s++) {
                System.out.print("  ");
            }

            int indent = i;
            while (indent < row) {
                System.out.print("  ");
                indent++;
            }

            //Print left side --> center
            for (int l = 1; l <= center; l = l * 2) {
                if (l < 10) {
                    System.out.print("   ");
                } else if (l < 100) {
                    System.out.print("  ");
                } else {
                    System.out.print(" ");
                }
                System.out.print(l);
            }

            //Update center value
            center *= 2;

            System.out.println();
        }
    }

    public void printFloydsTriangle() {
        int tracker = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(tracker);
                if (tracker > 10) {
                    System.out.print("  ");
                } else if (tracker < 10) {
                    System.out.print("   ");
                } else {
                    System.out.print(" ");
                }
                tracker++;
            }
            System.out.println();
        }
    }

    public void printPascalsPyramid() {
        for (int line = 1; line <= row; line++) {
//                System.out.print("     ");

            int indent = line;
            while (indent <= row) {
                System.out.print("   ");
                indent++;
            }

            // used to represent C(line, i)
            int C = 1;
            for (int i = 1; i <= line; i++) {

                // The first value in a line is always 1
                if (C >= 100) {
                    System.out.print("   ");
                } else if (C >= 10) {
                    System.out.print("    ");
                } else {
                    System.out.print("     ");
                }
                System.out.print(C);
                C = C * (line - i) / i;
            }
            System.out.println();
        }
    }

    public void printInvertedFullPyramid() {
        int center = (int) Math.pow(2, this.row - 1);
        for (int i = 0; i < row; i++) {
            for (int s = i; s > 0; s--) {
                System.out.print("  ");
            }

            int index = i;
            while (index > 0) {
                System.out.print("  ");
                index--;
            }

            //Print left side --> center
            for (int l = 1; l < center; l = l * 2) {
                System.out.print(l);
                if (l < 10) {
                    System.out.print("   ");
                } else if (l < 100) {
                    System.out.print("  ");
                } else {
                    System.out.print(" ");
                }
            }

            for (int r = center; r >= 1; r = r / 2) {
                System.out.print(r);
                if (r < 10) {
                    System.out.print("   ");
                } else if (r < 100) {
                    System.out.print("  ");
                } else {
                    System.out.print(" ");
                }
            }


            //Update center value
            center /= 2;

            System.out.println();
        }
    }

    public void printInvertedHalfLeftPyramid() {
        int center = (int) Math.pow(2, this.row - 1);
        for (int i = 0; i < row; i++) {
            for (int s = i; s > 0; s--) {
                System.out.print(" ");
            }

            int index = i;
            while (index >= 0) {
                System.out.print("   ");
                index--;
            }

            //Print left side --> center
            for (int l = 1; l <= center; l = l * 2) {
                System.out.print(l);
                if (l * 2 < 10) {
                    System.out.print("   ");
                } else if (l * 2 < 100) {
                    System.out.print("  ");
                } else {
                    System.out.print(" ");
                }
            }

            //Update center value
            center /= 2;

            System.out.println();
        }
    }

    public void printInvertedHalfRightPyramid() {
        int center = (int) Math.pow(2, this.row - 1);
        for (int i = 0; i < row; i++) {
            //Print center --> right side
            for (int r = center; r >= 1; r = r / 2) {
                System.out.print(r);
                if (r < 10) {
                    System.out.print("   ");
                } else if (r < 100) {
                    System.out.print("  ");
                } else {
                    System.out.print(" ");
                }
            }

            //Update center value
            center /= 2;

            System.out.println();
        }
    }

    public void printFullPyramid() {
        int center = 1;
        for (int i = 1; i <= row; i++) {
            for (int s = 0; s < row - i; s++) {
                System.out.print("  ");
            }

            int indent = i;
            while (indent < row) {
                System.out.print("  ");
                indent++;
            }

            //Print left side --> center
            for (int l = 1; l < center; l = l * 2) {
                System.out.print(l);
                if (l < 10) {
                    System.out.print("   ");
                } else if (l < 100) {
                    System.out.print("  ");
                } else {
                    System.out.print(" ");
                }
            }

            //Print center --> right side
            for (int r = center; r >= 1; r = r / 2) {
                System.out.print(r);
                if (r < 10) {
                    System.out.print("   ");
                } else if (r < 100) {
                    System.out.print("  ");
                } else {
                    System.out.print(" ");
                }
            }

            //Update center value
            center *= 2;

            System.out.println();
        }
    }

    // Validators
    private void validateRow(int row) throws Exception {
        if (row <= 0 || row >= 10) {
            throw new InvalidInputException("Number of row should be from 1 to 10!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter number of row: ");
            int row = sc.nextInt();
            PyramidGenerator p = new PyramidGenerator(row);
            System.out.println("Half Right Pyramid");
            p.printHalfRightPyramid();
            System.out.println("Half Left Pyramid");
            p.printHalfLeftPyramid();
            System.out.println("Full Pyramid");
            p.printFullPyramid();
            System.out.println("Inverted Half Right Pyramid");
            p.printInvertedHalfRightPyramid();
            System.out.println("Inverted Half Left Pyramid");
            p.printInvertedHalfLeftPyramid();
            System.out.println("Inverted Full Pyramid");
            p.printInvertedFullPyramid();
            System.out.println("Pascal Pyramid");
            p.printPascalsPyramid();
            System.out.println("Floyds Pyramid");
            p.printFloydsTriangle();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

