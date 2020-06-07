// Given a string s. In one step you can insert any character at any index of the string.

// Return the minimum number of steps to make s palindrome.

// A Palindrome String is one that reads the same backward as well as forward.

 

// Example 1:

// Input: s = "zzazz"
// Output: 0
// Explanation: The string "zzazz" is already palindrome we don't need any insertions.
// Example 2:

// Input: s = "mbadm"
// Output: 2
// Explanation: String can be "mbdadbm" or "mdbabdm".
// Example 3:

// Input: s = "leetcode"
// Output: 5
// Explanation: Inserting 5 characters the string becomes "leetcodocteel".
// Example 4:

// Input: s = "g"
// Output: 0
// Example 5:

// Input: s = "no"
// Output: 1
 

// Constraints:

// 1 <= s.length <= 500
// All characters of s are lower case English letters.

package hard;
class Solution {
    public int minInsertions(String s) {
        return s.length() - lps(s);
    }
     public static int lps(String s1) {
        String s2 = new StringBuilder(s1).reverse().toString();
        return longestCommonSubsequence(s1, s2);
    }
    public static int longestCommonSubsequence(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int[][] t = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                t[i][j] = t[i - 1][j - 1] + 1;
                else
                t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
            }
        }
        return t[m][n];
    }
}