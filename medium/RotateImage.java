package medium;

public class RotateImage {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reflect(matrix);
    }

    private void transpose(int[][] matrix) {
        int m = matrix.length;
        for (int i = 0; i < m; i++) {
            for (int j = i; j < m; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    private void reflect(int[][] matrix) {
        int m = matrix.length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][m - j - 1];
                matrix[i][m - j - 1] = temp;
            }
        }
    }
}
