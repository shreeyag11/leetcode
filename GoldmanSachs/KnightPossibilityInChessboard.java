package GoldmanSachs;

public class KnightPossibilityInChessboard {

    private int[][] nexts = { { 1, 2 }, { 2, 1 }, { 1, -2 }, { -2, 1 }, { -1, 2 }, { 2, -1 }, { -1, -2 }, { -2, -1 } };

    public double knightProbability(int N, int K, int r, int c) {
        double[][] curr = new double[N][N];
        double[][] next = new double[N][N];

        curr[r][c] = 1;

        for (int m = 1; m <= K; m++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (curr[i][j] != 0) {

                        for (int[] n : nexts) {
                            int ni = n[0] + i;
                            int nj = n[1] + j;
                            if (isValid(ni, nj, N)) {
                                next[ni][nj] += curr[i][j] / 8.0;
                            }
                        }
                    }
                }
            }
            curr = next;
            next = new double[N][N];
        }

        double sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (curr[i][j] != 0)
                    sum += curr[i][j];
            }
        }
        return sum;
    }

    private boolean isValid(int ni, int nj, int n) {
        return ni >= 0 && ni < n && nj >= 0 && nj < n;
    }
}
