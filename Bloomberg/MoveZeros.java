package Bloomberg;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int zero = 0, l = 0;
        while (l < nums.length) {
            if (nums[l] != 0) {
                int temp = nums[l];
                nums[l] = nums[zero];
                nums[zero] = temp;
                zero++;
            }
            l++;
        }
    }

}
