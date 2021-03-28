class Solution {
    public int getMaximumGold(int[][] grid) {
        int max = Integer.MIN_VALUE;
        int m = grid.length;
        if (m == 0)
            return 0;

        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0 && !visited[i][j]) {
                    int sum = dfs(i, j, grid, visited);
                    max = Math.max(sum, max);
                }
            }
        }
        return max;
    }

    private int dfs(int i, int j, int[][] g, boolean[][] visited) {
        if (i < 0 || i >= g.length || j < 0 || j >= g[0].length || g[i][j] == 0 || visited[i][j])
            return 0;
        visited[i][j] = true;
        int down = dfs(i + 1, j, g, visited);
        int right = dfs(i, j + 1, g, visited);
        int up = dfs(i - 1, j, g, visited);
        int left = dfs(i, j - 1, g, visited);
        visited[i][j] = false;
        return Math.max(down, Math.max(up, Math.max(left, right))) + g[i][j];
    }
}