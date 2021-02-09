class Solution {
    int[][] g;

    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        g = grid;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    res = Math.max(dfs(i, j, 0), res);
                }
            }
        }
        return res;
    }

    private int dfs(int i, int j, int sum) {
        if (i < 0 || i >= g.length || j < 0 || j >= g[0].length || g[i][j] == 0) {
            return 0;
        }
        g[i][j] = 0;
        return 1 + dfs(i + 1, j, sum) + dfs(i, j + 1, sum) + dfs(i - 1, j, sum) + dfs(i, j - 1, sum);
    }
}