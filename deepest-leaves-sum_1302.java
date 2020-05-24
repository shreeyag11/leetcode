// Given a binary tree, return the sum of values of its deepest leaves.

// Example 1:

// Input: root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
// Output: 15
 

// Constraints:

// The number of nodes in the tree is between 1 and 10^4.
// The value of nodes is between 1 and 100.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    int sum=0,height=0;
    public int deepestLeavesSum(final TreeNode root) {
        height = height(root);
        dfs(root, 1);
        return sum;
    }   
    public void dfs(final TreeNode node, final int curr) {
        if(node==null)
            return;
        if(curr == height){
            sum+=node.val;
        }
        dfs(node.left,curr+1);
        dfs(node.right,curr+1);
    }
    public int height(final TreeNode node){
        if(node == null)
            return 0;
       return Math.max(height(node.left), height(node.right))+1;
    }
}