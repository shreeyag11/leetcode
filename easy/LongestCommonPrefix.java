package easy;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String res = strs[0];
        for (String s : strs) {
            res = common(res, s);
        }
        return res;
    }

    private String common(String s1, String s2) {
        StringBuilder s = new StringBuilder();
        int i = 0, j = 0;
        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) != s2.charAt(j)) {
                break;
            }
            s.append(s1.charAt(i));
            i++;
            j++;
        }
        return s.toString();
    }
}

// Write a function to find the longest common prefix string amongst an array of
// strings.

// If there is no common prefix, return an empty string "".

// Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"
// Example 2:

// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.

// Constraints:

// 0 <= strs.length <= 200
// 0 <= strs[i].length <= 200
// strs[i] consists of only lower-case English letters.