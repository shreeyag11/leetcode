package GoldmanSachs;

public class DeleteAndEarn {
    public int deleteAndEarn(int[] nums) {
        int max = Integer.MIN_VALUE;

        if (nums.length == 0)
            return 0;

        if (nums.length == 1)
            return nums.length;

        for (int num : nums)
            max = Math.max(max, num);

        int[] dp = new int[max + 1];
        for (int num : nums)
            dp[num] += num;

        dp[dp.length - 2] = Math.max(dp[dp.length - 2], dp[dp.length - 1]);

        for (int i = dp.length - 3; i >= 0; i--) {
            dp[i] = Math.max(dp[i] + dp[i + 2], dp[i + 1]);
        }

        return dp[0];
    }
}
