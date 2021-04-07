package GoldmanSachs;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2)
            return s;

        boolean[][] dp = new boolean[s.length()][s.length()];
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j >= 0; j--) {
                boolean edges = s.charAt(i) == s.charAt(j);

                if (i == j)
                    dp[i][j] = true;
                else if (i - j == 1)
                    dp[i][j] = edges;
                else if (edges && dp[i - 1][j + 1]) {
                    dp[i][j] = true;
                }

                if (dp[i][j] && i - j > end - start) {
                    end = i;
                    start = j;
                }
            }
        }
        return s.substring(start, end + 1);
    }
}
