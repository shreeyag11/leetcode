package Intel;

public class ProductOfArray_238 {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            left[i + 1] = nums[i] * left[i];
        }
        right[nums.length - 1] = 1;
        for (int i = nums.length - 1; i > 0; i--) {
            right[i - 1] = nums[i] * right[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = left[i] * right[i];
        }
        return nums;
    }
}
