package GoldmanSachs;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] temp = Arrays.copyOf(heights, heights.length);
        Arrays.sort(temp);
        int count = 0;
        for (int i = 0; i < heights.length; i++)
            if (heights[i] != temp[i])
                count++;
        return count;
    }
}
