package GoldmanSachs;

public class FindMinInRotatedSortedArray {
    public int findMin(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        int left = 0, right = nums.length - 1;

        if (nums[right] > nums[0]) {
            return nums[0];
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1])
                return nums[mid + 1];
            if (nums[mid] < nums[mid - 1])
                return nums[mid];
            if (nums[mid] > nums[right])
                left = mid + 1;
            else
                right = mid - 1;
        }

        return nums[0];
    }
}
