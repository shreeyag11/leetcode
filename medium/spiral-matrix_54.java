import java.util.ArrayList;
import java.util.List;

// Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

// Example 1:

// Input:
// [
//  [ 1, 2, 3 ],
//  [ 4, 5, 6 ],
//  [ 7, 8, 9 ]
// ]
// Output: [1,2,3,6,9,8,7,4,5]
// Example 2:

// Input:
// [
//   [1, 2, 3, 4],
//   [5, 6, 7, 8],
//   [9,10,11,12]
// ]
// Output: [1,2,3,4,8,12,11,10,9,5,6,7]

class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l1 = new ArrayList<>();
        if (matrix.length == 0)
            return l1;
        int m = matrix.length - 1, n = matrix[0].length - 1;
        int T = 0, B = m, L = 0, R = n, dir = 0;
        while (T <= B && L <= R) {
            if (dir == 0) {
                for (int i = L; i <= R; i++)
                    l1.add(matrix[T][i]);
                T++;
                dir = 1;
            } else if (dir == 1) {
                for (int i = T; i <= B; i++)
                    l1.add(matrix[i][R]);
                R--;
                dir = 2;
            } else if (dir == 2) {
                for (int i = R; i >= L; i--)
                    l1.add(matrix[B][i]);
                B--;
                dir = 3;
            } else if (dir == 3) {
                for (int i = B; i >= T; i--)
                    l1.add(matrix[i][L]);
                L++;
                dir = 0;
            }
        }
        return l1;
    }
}