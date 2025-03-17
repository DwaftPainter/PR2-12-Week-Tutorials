package Week09.TutorialWeek09;

public class Matrix implements java.io.Serializable {
    private double[][] matrix;

    public Matrix(int rows, int cols) {
        this.matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.matrix[i][j] = 0;
            }
        }
    }

    public Matrix sum(Matrix m) {
        int rows = this.matrix.length;
        int cols = this.matrix[0].length;
        if (rows != m.matrix.length || cols != m.matrix[0].length) {
            return null;
        }
        Matrix res = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res.matrix[i][j] = this.matrix[i][j] + m.matrix[i][j];
            }
        }

        return res;
    }

    public Matrix product(Matrix m) {
        int rows = this.matrix.length;
        int cols = this.matrix[0].length;
        if (cols != m.matrix.length) {
            return null;
        }
        Matrix newMatrix = new Matrix(rows, m.matrix[0].length);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                double productCell = 0;
                int b = 0;
                while (b <= cols - 1) {
                    productCell += this.matrix[i][b] * m.matrix[b][j];
                    b++;
                }
                newMatrix.matrix[i][j] = productCell;
            }
        }

        return newMatrix;
    }

    public double[][] transpose() {
        int rows = this.matrix.length;
        int cols = this.matrix[0].length;

        Matrix transposeMatrix = new Matrix(cols, rows);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposeMatrix.matrix[j][i] = this.matrix[i][j];
            }
        }

        return transposeMatrix.matrix;
    }

    public void save(String filename) throws java.io.IOException, NotPossibleException {
        try {
            String[] filePath = filename.split("/");
            String directory = "";
            for (int i = 0; i < filePath.length - 1; i++) {
                directory += filePath[i] + "/";
            }

            java.io.File f = new java.io.File(directory);
            if (!f.exists()) {
                f.mkdir();
                java.util.Set<java.nio.file.attribute.PosixFilePermission> perms = java.nio.file.attribute.PosixFilePermissions.fromString("rwxrwxrwx");
                java.nio.file.Files.setPosixFilePermissions(f.toPath(), perms);
            }
            XFile.writeObject(f.getPath() + "/" + filePath[filePath.length - 1], this);

        } catch (Exception e) {
            throw new NotPossibleException("Invalid matrix file");
        }
    }

    public static Matrix read(String filename) throws NotPossibleException {
        try {
            return (Matrix) XFile.readObject(filename);
        } catch (Exception e) {
            throw new NotPossibleException("Invalid matrix file");
        }

    }

    public void setValue(int row, int col, double value) {
        this.matrix[row][col] = value;
    }

    public void setData(double[][] matrix) {
        this.matrix = matrix;
    }

    public void print() {
        for (int i = 0; i < this.matrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < this.matrix[i].length; j++) {
                System.out.print(this.matrix[i][j]);
                if (j < this.matrix[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}
