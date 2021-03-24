package GoldmanSachs;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length + 1;
        int expected = (n - 1) * n / 2;
        int sum = 0;
        for (int i : nums)
            sum += i;
        return expected - sum;
    }
}
