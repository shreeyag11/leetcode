package GoldmanSachs;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {

        int globalMax = Integer.MIN_VALUE;
        int localMax = 0;
        for (int i = 0; i < nums.length; i++) {
            localMax = Math.max(localMax + nums[i], nums[i]);
            globalMax = Math.max(localMax, globalMax);
        }
        return globalMax;
    }
}
