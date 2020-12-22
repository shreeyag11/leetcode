package Bloomberg;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length - 1, n = matrix[0].length - 1;
        int T = 0, B = m, L = 0, R = n, dir = 0;
        while (T <= B && L <= R) {
            if (dir == 0) {
                for (int i = L; i <= R; i++) {
                    res.add(matrix[T][i]);
                }
                T++;
                dir = 1;
            } else if (dir == 1) {
                for (int i = T; i <= B; i++) {
                    res.add(matrix[i][R]);
                }
                R--;
                dir = 2;
            } else if (dir == 2) {
                for (int i = R; i >= L; i--) {
                    res.add(matrix[B][i]);
                }
                B--;
                dir = 3;
            } else if (dir == 3) {
                for (int i = B; i >= T; i--) {
                    res.add(matrix[i][L]);
                }
                L++;
                dir = 0;
            }

        }
        return res;
    }
}
