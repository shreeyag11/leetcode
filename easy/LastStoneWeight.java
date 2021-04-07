package easy;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        int i = stones.length - 1;
        while (i > 0) {
            Arrays.sort(stones, 0, i + 1);
            if (stones[i - 1] == stones[i]) {
                stones[i - 1] = 0;
                i -= 2;
            } else {
                stones[i - 1] = Math.abs(stones[i] - stones[i - 1]);
                i--;
            }
        }
        return stones[0];
    }
}
