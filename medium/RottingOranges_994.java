package medium;

import java.util.*;

public class RottingOranges_994 {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int freshCount = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1)
                    freshCount++;
                else if (grid[i][j] == 2)
                    q.add(new int[] { i, j });
            }
        }
        int time = 0;
        int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        while (!q.isEmpty() && freshCount > 0) {
            time++;
            int size = q.size();
            while (size-- > 0) {
                int[] rotten = q.poll();
                for (int[] d : dir) {
                    int x = rotten[0] + d[0];
                    int y = rotten[1] + d[1];
                    if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == 0 || grid[x][y] == 2)
                        continue;
                    q.add(new int[] { x, y });
                    grid[x][y] = 2;
                    freshCount--;
                }
            }
        }
        return freshCount == 0 ? time : -1;
    }
}

// In a given grid, each cell can have one of three values:

// the value 0 representing an empty cell;
// the value 1 representing a fresh orange;
// the value 2 representing a rotten orange.
// Every minute, any fresh orange that is adjacent (4-directionally) to a rotten
// orange becomes rotten.

// Return the minimum number of minutes that must elapse until no cell has a
// fresh orange. If this is impossible, return -1 instead.

// Example 1:

// Input: [[2,1,1],[1,1,0],[0,1,1]]
// Output: 4
// Example 2:

// Input: [[2,1,1],[0,1,1],[1,0,1]]
// Output: -1
// Explanation: The orange in the bottom left corner (row 2, column 0) is never
// rotten, because rotting only happens 4-directionally.
// Example 3:

// Input: [[0,2]]
// Output: 0
// Explanation: Since there are already no fresh oranges at minute 0, the answer
// is just 0.

// Note:

// 1 <= grid.length <= 10
// 1 <= grid[0].length <= 10
// grid[i][j] is only 0, 1, or 2.