import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// Given a collection of intervals, merge all overlapping intervals.

// Example 1:

// Input: [[1,3],[2,6],[8,10],[15,18]]
// Output: [[1,6],[8,10],[15,18]]
// Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
// Example 2:

// Input: [[1,4],[4,5]]
// Output: [[1,5]]
// Explanation: Intervals [1,4] and [4,5] are considered overlapping.
// NOTE: input types have been changed on April 15, 2019. Please reset to default code definition to get new method signature.

class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0)
            return intervals;
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        List<int[]> res = new LinkedList<>();
        int j = 0;
        for (int i = 0; i < intervals.length - 1; i++) {
            if (start[i + 1] > end[i]) {
                res.add(new int[] { start[j], end[i] });
                j = i + 1;
            }
        }
        res.add(new int[] { start[j], end[intervals.length - 1] });
        return res.toArray(new int[res.size() - 1][]);
    }
}