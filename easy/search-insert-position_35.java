// Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You may assume no duplicates in the array.

// Example 1:

// Input: [1,3,5,6], 5
// Output: 2
// Example 2:

// Input: [1,3,5,6], 2
// Output: 1
// Example 3:

// Input: [1,3,5,6], 7
// Output: 4
// Example 4:

// Input: [1,3,5,6], 0
// Output: 0

class Search {
    public int searchInsert(int[] nums, int target) {
        return binary(nums, 0, nums.length - 1, target);
    }

    public int binary(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binary(arr, l, mid - 1, x);
            return binary(arr, mid + 1, r, x);
        }
        return l + (r - l) / 2;
    }
}
