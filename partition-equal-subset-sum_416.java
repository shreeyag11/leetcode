// Given a non-empty array containing only positive integers, find if the array can be partitioned into two subsets such that the sum of elements in both subsets is equal.

// Note:

// Each of the array element will not exceed 100.
// The array size will not exceed 200.
 

// Example 1:

// Input: [1, 5, 11, 5]

// Output: true

// Explanation: The array can be partitioned as [1, 5, 5] and [11].
 

// Example 2:

// Input: [1, 2, 3, 5]

// Output: false

// Explanation: The array cannot be partitioned into equal sum subsets.

class Partition {
    public boolean canPartition(int[] nums) {
        int n=nums.length, sum=0;
        for(int i:nums)
            sum += i;
        if(sum % 2 != 0)
            return false;
        else 
            return subsetSum(nums, sum/2, n); 
    }
    public boolean subsetSum(int[] arr,int sum,int n) {
        boolean t[][] = new boolean[n+1][sum+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(j==0)
                    t[i][j] = true;
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(arr[i-1] <= j)
                    t[i][j] = t[i-1][j] || t[i-1][j-arr[i-1]];
                else
                    t[i][j] = t[i-1][j];
            }
        }
        return t[n][sum];
    }
}