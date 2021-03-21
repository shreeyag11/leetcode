package GoldmanSachs;

public class MinSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int left = 0;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                res = Math.min(i + 1 - left, res);
                sum -= nums[left];
                left++;
            }
        }
        return res != Integer.MAX_VALUE ? res : 0;
    }
}
