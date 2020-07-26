// Given a positive integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

// Example:

// Input: 3
// Output:
// [
//  [ 1, 2, 3 ],
//  [ 8, 9, 4 ],
//  [ 7, 6, 5 ]
// ]

class SpiralMatrix2 {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        n = n - 1;
        int num = 1, T = 0, B = n, L = 0, R = n, dir = 0;
        while (T <= B && L <= R) {
            if (dir == 0) {
                for (int i = L; i <= R; i++)
                    matrix[T][i] = num++;
                T++;
                dir = 1;
            } else if (dir == 1) {
                for (int i = T; i <= B; i++)
                    matrix[i][R] = num++;
                R--;
                dir = 2;
            } else if (dir == 2) {
                for (int i = R; i >= L; i--)
                    matrix[B][i] = num++;
                B--;
                dir = 3;
            } else if (dir == 3) {
                for (int i = B; i >= T; i--)
                    matrix[i][L] = num++;
                L++;
                dir = 0;
            }
        }
        return matrix;
    }
}