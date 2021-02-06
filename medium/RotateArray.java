// class Solution {
//     public void rotate(int[] nums, int k) {
//         while(k > 0) {
//             rotateRight(nums);
//             k--;
//         }
//     }

//     private void rotateRight(int[] nums) {
//         int temp = nums[nums.length - 1];
//         for(int i = nums.length - 1; i >= 1; i--) {
//             nums[i] = nums[i - 1]; 
//         }
//         nums[0] = temp;
//     }
// }

class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}