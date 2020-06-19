// Given two words word1 and word2, find the minimum number of steps required to make word1 and word2 the same, where in each step you can delete one character in either string.

// Example 1:
// Input: "sea", "eat"
// Output: 2
// Explanation: You need one step to make "sea" to "ea" and another step to make "eat" to "ea".
// Note:
// The length of given words won't exceed 500.
// Characters in given words can only be lower-case letters.

class MinDistance {
    public int minDistance(String word1, String word2) {
        return (word1.length()+word2.length()-lowestCommonSubsequence(word1,word2)*2);
    }
    public static int lowestCommonSubsequence(String s1, String s2) {
        int m = s1.length(), n= s2.length();
        int[][] t = new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1))
                    t[i][j] = t[i-1][j-1]+1;
                else
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]); 
            }
        }
        return t[m][n];
    }
}