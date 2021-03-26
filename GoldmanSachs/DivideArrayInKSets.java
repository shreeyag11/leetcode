package GoldmanSachs;

public class DivideArrayInKSets {
    public boolean isPossibleDivide(int[] nums, int k) {
        if (nums.length % k != 0)
            return false;

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        while (!map.isEmpty()) {
            int first = map.firstKey();
            for (int i = first; i < first + k; i++) {
                if (!map.containsKey(i))
                    return false;
                int count = map.get(i);
                if (count == 1)
                    map.remove(i);
                else
                    map.replace(i, count - 1);
            }
        }

        return true;
    }
}
