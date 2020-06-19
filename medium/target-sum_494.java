// You are given a list of non-negative integers, a1, a2, ..., an, and a target, S. Now you have 2 symbols + and -. For each integer, you should choose one from + and - as its new symbol.

// Find out how many ways to assign symbols to make sum of integers equal to target S.

// Example 1:
// Input: nums is [1, 1, 1, 1, 1], S is 3. 
// Output: 5
// Explanation: 

// -1+1+1+1+1 = 3
// +1-1+1+1+1 = 3
// +1+1-1+1+1 = 3
// +1+1+1-1+1 = 3
// +1+1+1+1-1 = 3

// There are 5 ways to assign symbols to make the sum of nums be target 3.
// Note:
// The length of the given array is positive and will not exceed 20.
// The sum of elements in the given array will not exceed 1000.
// Your output answer is guaranteed to be fitted in a 32-bit integer.

class Target {
    public int findTargetSumWays(int[] nums, int S) {
        int count=0;
         int sum = 0;
        for (int i : nums){
            sum += i;
            if(i == 0)
                count++;
        }
        if(S > sum)
            return 0;
        if((S+sum)%2!=0)
            return 0;
        sum = (sum+S)/2;
        return subsetSum(nums, sum, count);
    }
    public static int subsetSum(int[] arr, int sum, int count) {
        int n = arr.length;
        int[][] t = new int[n + 1][sum + 1];
        for (int i = 0; i <= n; i++) 
                    t[i][0] = 1;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if(arr[i-1]==0)
                    t[i][j] = t[i-1][j];
                else if(j < arr[i-1])
                    t[i][j] = t[i-1][j];
                else
                    t[i][j] = t[i-1][j] + t[i-1][j-arr[i-1]];
            }
        }
        return (int)Math.pow(2,count)*t[n][sum];
    }

} 
