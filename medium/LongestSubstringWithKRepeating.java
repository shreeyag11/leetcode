import java.util.*;

// Find the length of the longest substring T of a given string (consists of lowercase letters only) such that every character in T appears no less than k times.

// Example 1:

// Input:
// s = "aaabb", k = 3

// Output:
// 3

// The longest substring is "aaa", as 'a' is repeated 3 times.
// Example 2:

// Input:
// s = "ababbc", k = 2

// Output:
// 5

// The longest substring is "ababb", as 'a' is repeated 2 times and 'b' is repeated 3 times.

public class LongestSubstringWithKRepeating {
    public int longestSubstring(String s, int k) {
        int n = s.length();
        if (n == 0 || n < k)
            return 0;
        if (k <= 1)
            return n;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        int l = 0;
        while (l < n && map.get(s.charAt(l)) >= k)
            l++;
        if (l >= n)
            return l;
        int ls1 = longestSubstring(s.substring(0, l), k);
        while (l < n && map.get(s.charAt(l)) < k)
            l++;
        int ls2 = (l < n) ? longestSubstring(s.substring(l), k) : 0;
        return Math.max(ls1, ls2);
    }
}
