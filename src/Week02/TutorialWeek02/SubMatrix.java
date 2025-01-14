package Week02.TutorialWeek02;

import java.util.Scanner;

public class SubMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows in the matrix: ");
        int rows = scanner.nextInt();
        System.out.println("Enter the matrix row by row: ");
        int[][] m = new int[rows][rows];
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < rows; j++) {
                m[i][j] = scanner.nextInt();
            }
        }
        int[] res = findLargestBlock(m);

        System.out.printf("The maximum square submatrix is at (%d, %d) with size %d", res[0], res[1], res[2]);
    }

    static int[] findLargestBlock(int[][] m) {
        int[] res = new int[3];
        int size = m.length;
        int[][] submatrix = new int[size][size];
        int maxSize = 0;
        int rowIndex = 0;
        int colIndex = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                submatrix[i][j] = 0;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (m[i][j] == 1) {
                    if (i == 0 || j == 0) {
                        submatrix[i][j] = 1;
                    } else {
                        submatrix[i][j] = Math.min(submatrix[i][j - 1], submatrix[i - 1][j]);
                        submatrix[i][j] = Math.min(submatrix[i][j], submatrix[i - 1][j -1]) + 1;
                    }

                    if (submatrix[i][j] > maxSize) {
                        maxSize = submatrix[i][j];
                        rowIndex = i;
                        colIndex = j;
                    }
                }
            }
        }

        int firstRow = rowIndex - maxSize + 1;
        int firstCol = colIndex - maxSize + 1;

        res[0] = firstRow;
        res[1] = firstCol;
        res[2] = maxSize;

        return res;
    }
}
