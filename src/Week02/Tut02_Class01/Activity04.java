package Week02.Tut02_Class01;

public class Activity04 {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2 }, { 4, 5 }, { 7, 8 } };

        System.out.println("Original Matrix:");
        print2DArray(matrix);

        int[][] transposedMatrix = transpose(matrix);

        System.out.println("\nTransposed Matrix:");
        print2DArray(transposedMatrix);

        int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        System.out.println("Original Matrix:");
        print2DArray(matrix2);

        int[][] transposedMatrix2 = transpose(matrix2);

        System.out.println("\nTransposed Matrix:");
        print2DArray(transposedMatrix2);
    }

    public static void print2DArray(int[][] matrix) {
        for (int[] row : matrix) {
            for (int j : row) {
                System.out.printf("%4d", j);
            }
            System.out.println();
        }
    }

    static int[][] transpose(int[][] matrix) {
        int rowLen = matrix.length;
        int colLen = matrix[0].length;

        int[][] transpose = new int[colLen][rowLen];

        for (int i = 0; i < rowLen; i++) {
            for  (int j = 0; j < colLen; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }
}
