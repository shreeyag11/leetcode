package Intel;

public class TrappingRainWater_42 {
    public int trap(int[] height) {
        if (height.length == 0)
            return 0;
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int max = height[0];
        for (int i = 0; i < height.length; i++) {
            max = Math.max(max, height[i]);
            left[i] = max;
        }
        max = height[height.length - 1];
        for (int i = height.length - 1; i >= 0; i--) {
            max = Math.max(max, height[i]);
            right[i] = max;
        }

        int count = 0;
        for (int i = 0; i < height.length; i++) {
            count += Math.min(left[i], right[i]) - height[i];

        }
        return count;
    }
}
