// In a town, there are N people labelled from 1 to N.  There is a rumor that one of these people is secretly the town judge.

// If the town judge exists, then:

// The town judge trusts nobody.
// Everybody (except for the town judge) trusts the town judge.
// There is exactly one person that satisfies properties 1 and 2.
// You are given trust, an array of pairs trust[i] = [a, b] representing that the person labelled a trusts the person labelled b.

// If the town judge exists and can be identified, return the label of the town judge.  Otherwise, return -1.

// Example 1:

// Input: N = 2, trust = [[1,2]]
// Output: 2
// Example 2:

// Input: N = 3, trust = [[1,3],[2,3]]
// Output: 3
// Example 3:

// Input: N = 3, trust = [[1,3],[2,3],[3,1]]
// Output: -1
// Example 4:

// Input: N = 3, trust = [[1,2],[2,3]]
// Output: -1
// Example 5:

// Input: N = 4, trust = [[1,3],[1,4],[2,3],[2,4],[4,3]]
// Output: 3

// Constraints:

// 1 <= N <= 1000
// 0 <= trust.length <= 10^4
// trust[i].length == 2
// trust[i] are all different
// trust[i][0] != trust[i][1]
// 1 <= trust[i][0], trust[i][1] <= N

package easy;

import java.util.*;

public class findTheTownJudge_997 {
    class Solution {
        public int findJudge(int N, int[][] trust) {
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < trust.length; i++) {
                if (map.containsKey(trust[i][0])) {
                    List<Integer> l = map.get(trust[i][0]);
                    l.add(trust[i][1]);
                    map.put(trust[i][0], l);
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(trust[i][1]);
                    map.put(trust[i][0], list);
                }
            }
            List<Integer> res = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                if (!map.containsKey(i + 1))
                    res.add(i + 1);
            }
            HashMap<Integer, Integer> ans = new HashMap<>();
            int count = 0;
            for (int i = 0; i < res.size(); i++) {
                count = 0;
                for (Map.Entry<Integer, List<Integer>> x : map.entrySet()) {
                    if (x.getValue().contains(res.get(i)))
                        count++;
                }
                ans.put(res.get(i), count);
            }
            for (Map.Entry<Integer, Integer> x : ans.entrySet()) {
                if (x.getValue() == N - 1)
                    return x.getKey();
            }
            return -1;

        }
    }
}
