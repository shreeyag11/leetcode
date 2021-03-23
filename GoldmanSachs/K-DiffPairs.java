package GoldmanSachs;

public class K-DiffPairs
{

    public int findPairs(int[] nums, int k) {
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;
            while (j < nums.length) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    if (nums[i] > nums[j])
                        set.add(Arrays.asList(nums[i], nums[j]));
                    else
                        set.add(Arrays.asList(nums[j], nums[i]));
                }
                j++;
            }
        }
        return set.size();
    }
}
