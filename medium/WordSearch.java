package medium;

public class WordSearch {
    char[][] g;

    public boolean exist(char[][] board, String word) {
        boolean[][] present = new boolean[board.length][board[0].length];
        int res = 0;
        g = board;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(i, j, word, 0, present))
                        return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int i, int j, String s, int n, boolean[][] present) {
        if (n == s.length()) {
            return true;
        }
        if (i < 0 || i >= g.length || j < 0 || j >= g[0].length || g[i][j] != s.charAt(n) || present[i][j]) {
            return false;
        }
        if (g[i][j] == s.charAt(n)) {
            present[i][j] = true;
            if (dfs(i + 1, j, s, n + 1, present) || dfs(i, j + 1, s, n + 1, present) || dfs(i - 1, j, s, n + 1, present)
                    || dfs(i, j - 1, s, n + 1, present))
                return true;
            present[i][j] = false;
        }
        return false;
    }
}
