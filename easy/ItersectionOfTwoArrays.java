package easy;

public class ItersectionOfTwoArrays {
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();
            for (int n : nums1) {
                list1.add(n);
            }
            for (int n : nums2) {
                list2.add(n);
            }
            List<Integer> res = new ArrayList<>();
            int i = 0;
            while (i < list1.size()) {
                if (list2.contains(list1.get(i))) {
                    res.add(list1.get(i));
                    list2.remove(list2.indexOf(list1.get(i)));
                }
                i++;

            }
            int[] a = new int[res.size()];
            for (int j = 0; j < res.size(); j++)
                a[j] = res.get(j);
            return a;
        }
    }
}

// Given two arrays, write a function to compute their intersection.

// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2,2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [4,9]
// Note:

// Each element in the result should appear as many times as it shows in both
// arrays.
// The result can be in any order.
// Follow up:

// What if the given array is already sorted? How would you optimize your
// algorithm?
// What if nums1's size is small compared to nums2's size? Which algorithm is
// better?
// What if elements of nums2 are stored on disk, and the memory is limited such
// that you cannot load all elements into the memory at once?
