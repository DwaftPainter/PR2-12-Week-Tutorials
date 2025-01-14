package Week02.TutorialWeek02;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2 }, { 4, 5 }, { 7, 8 } };

        System.out.println("Original Matrix:");
        print2DArray(matrix);

        // Compute the transpose
        int[][] transposedMatrix = transpose(matrix);

        System.out.println("\nTransposed Matrix:");
        print2DArray(transposedMatrix);
    }

    public static void print2DArray(int[][] matrix) {
        //Loop through each row in a matrix
        for (int[] row : matrix) {
            //Print each element in a row
            for (int j : row) {
                System.out.printf("%4d", j);
            }
            //Down line each row
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
