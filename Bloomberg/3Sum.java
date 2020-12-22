package Bloomberg;

public class 3Sum {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> res = new ArrayList<>(); 
            for(int i = 0; i < nums.length; i++) {
                if(i == 0 || nums[i-1] != nums[i]) {
                    twoSum(res, nums, i);
                }
            }
            return res;
        }
        
        private void twoSum(List<List<Integer>> res, int[] nums, int i) {
            int lo = i + 1, hi = nums.length - 1;
            while(lo < hi) {
                int sum = nums[i] + nums[lo] + nums[hi];
                if(sum < 0){
                    ++lo;
                }
                else if(sum > 0){
                    --hi;
                }
                else {
                    res.add(Arrays.asList(nums[i], nums[lo++], nums[hi--]));
                    while(lo < hi && nums[lo] == nums[lo - 1])
                        ++lo;
                }
            }
        }
}
