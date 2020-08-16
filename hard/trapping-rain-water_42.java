import java.util.ArrayList;
import java.util.List;

// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

// The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped. Thanks Marcos for contributing this image!

// Example:

// Input: [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6

class TrappinRainWater {
    public int trap(int[] height) {
        if (height.length == 0)
            return 0;
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        int max = height[0];
        for (int i : height) {
            max = Math.max(i, max);
            l1.add(max);
        }
        int maxR = height[height.length - 1];
        for (int i = height.length - 1; i >= 0; i--) {
            maxR = Math.max(maxR, height[i]);
            l2.add(maxR);
        }
        int ans = 0, i = 0, j = height.length - 1;
        while (i < l1.size()) {
            ans += Math.min(l1.get(i), l2.get(j)) - height[i];
            i++;
            j--;
        }
        return ans;
    }
}