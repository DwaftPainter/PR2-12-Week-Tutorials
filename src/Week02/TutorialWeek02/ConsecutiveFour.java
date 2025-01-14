package Week02.TutorialWeek02;

public class ConsecutiveFour {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = scanner.nextInt();
        System.out.println("Enter values into the matrix: ");
        int[][] values = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                values[i][j] = scanner.nextInt();
            }
        }

        System.out.println(isConsecutiveFour(values));
    }

    public static boolean isConsecutiveFour(int[][] values) {
        int checkPoint = 1;
        int rows = values.length;
        int columns = values[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (j + 1 < columns && values[i][j] == values[i][j + 1]) {
                    checkPoint++;
                } else {
                    continue;
                }
            }
            if (checkPoint == 4) {
                return true;
            }
            checkPoint = 1;
        }

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                if (j + 1 < rows && values[j][i] == values[j + 1][i]) {
                    checkPoint++;
                } else {
                    continue;
                }
            }
            if (checkPoint == 4) {
                return true;
            }
            checkPoint = 0;
        }

        for (int i = 0; i <= rows - 4; i++) {
            for (int j = 0; j <= columns - 4; j++) {
                if (values[i][j] == values[i + 1][j + 1] && values[i][j] == values[i + 2][j + 2] && values[i][j] == values[i + 3][j + 3]) {
                    return true;
                }
            }
        }

        for (int i = 0; i <= rows - 4; i++) {
            for (int j = columns - 1; j >= 3; j--) {
                if (values[i][j] == values[i + 1][j - 1] && values[i][j] == values[i + 2][j - 2] && values[i][j] == values[i + 3][j - 3]) {
                    return true;
                }
            }
        }

        return false;
    }
}

