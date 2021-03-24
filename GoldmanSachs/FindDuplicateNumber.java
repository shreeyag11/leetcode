package GoldmanSachs;

public class FindDuplicateNumber {
    public int findDuplicate(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums)
            if (list.contains(num))
                return num;
            else
                list.add(num);
        return -1;
    }
}
