// Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

// Example 1:

// Input: grid = [
//   ["1","1","1","1","0"],
//   ["1","1","0","1","0"],
//   ["1","1","0","0","0"],
//   ["0","0","0","0","0"]
// ]
// Output: 1
// Example 2:

// Input: grid = [
//   ["1","1","0","0","0"],
//   ["1","1","0","0","0"],
//   ["0","0","1","0","0"],
//   ["0","0","0","1","1"]
// ]
// Output: 3

class NoOfIslands {
    int x, y;
    char[][] g;

    public int numIslands(char[][] grid) {
        g = grid;
        y = g.length;
        if (y == 0)
            return 0;
        x = g[0].length;
        int count = 0;
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (g[i][j] == '1') {
                    dfs(i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(int i, int j) {
        if (i < 0 || j < 0 || i >= y || j >= x || g[i][j] != '1')
            return;
        g[i][j] = '0';
        dfs(i + 1, j);
        dfs(i, j + 1);
        dfs(i - 1, j);
        dfs(i, j - 1);

    }
}