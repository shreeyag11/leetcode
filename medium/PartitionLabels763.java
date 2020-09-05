// A string S of lowercase English letters is given. We want to partition this string into as many parts as possible so that each letter appears in at most one part, and return a list of integers representing the size of these parts.

// Example 1:

// Input: S = "ababcbacadefegdehijhklij"
// Output: [9,7,8]
// Explanation:
// The partition is "ababcbaca", "defegde", "hijhklij".
// This is a partition so that each letter appears in at most one part.
// A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts.

// Note:

// S will have length in range [1, 500].
// S will consist of lowercase English letters ('a' to 'z') only.

package medium;

import java.util.*;

public class PartitionLabels763 {
    public List<Integer> partitionLabels(String S) {
        List<Integer> list = new ArrayList<>();

        int[] last = new int[26];
        for (int i = 0; i < S.length(); i++) {
            last[S.charAt(i) - 'a'] = i;
        }

        int l = 0, s = 0;
        for (int i = 0; i < S.length(); i++) {
            l = Math.max(l, last[S.charAt(i) - 'a']);
            if (l == i) {
                list.add(l - s + 1);
                s = l + 1;
            }
        }
        return list;
    }
}
