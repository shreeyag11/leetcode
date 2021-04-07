package GoldmanSachs;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int len = 0;
        for (int s : set) {
            if (!set.contains(s - 1)) {
                int curr = s;
                int streak = 1;

                while (set.contains(curr + 1)) {
                    curr += 1;
                    streak += 1;
                }

                len = Math.max(streak, len);
            }
        }
        return len;
    }
}
