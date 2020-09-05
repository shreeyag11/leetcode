// Given an array of integers, find out whether there are two distinct indices i and j in the array such that the absolute difference between nums[i] and nums[j] is at most t and the absolute difference between i and j is at most k.

// Example 1:

// Input: nums = [1,2,3,1], k = 3, t = 0
// Output: true
// Example 2:

// Input: nums = [1,0,1,1], k = 1, t = 2
// Output: true
// Example 3:

// Input: nums = [1,5,9,1,5,9], k = 2, t = 3
// Output: false

// Constraints:

// 0 <= nums.length <= 2 * 104
// -231 <= nums[i] <= 231 - 1
// 0 <= k <= 104
// 0 <= t <= 231 - 1

package medium;

import java.util.*;

public class ContainsDuplicateIII {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        Set<Integer> ss = new HashSet<Integer>();
        for (int i : nums)
            ss.add(i);
        if (t == 0 && nums.length == ss.size())
            return false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < i + 1 + k; j++) {
                if (j >= nums.length)
                    break;
                if (Math.abs((long) nums[i] - (long) nums[j]) <= t)
                    return true;
            }
        }
        return false;
    }
}
