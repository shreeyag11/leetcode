// Given the root of a binary tree, the level of its root is 1, the level of its children is 2, and so on.

// Return the smallest level X such that the sum of all the values of nodes at level X is maximal.

// Example 1:

// Input: [1,7,0,7,-8,null,null]
// Output: 2
// Explanation: 
// Level 1 sum = 1.
// Level 2 sum = 7 + 0 = 7.
// Level 3 sum = 7 + -8 = -1.
// So we return the level with the maximum sum which is level 2.

// Note:

// The number of nodes in the given tree is between 1 and 10^4.
// -10^5 <= node.val <= 10^5

package medium;

import java.util.*;

public class maximum-level-sum-bt_1161 {
    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        int max = Integer.MIN_VALUE;
        int level=1, l=0;
        int sum=0;
        if(root==null)
            return sum;
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            while(size>0){
                root = q.poll();
                sum += root.val;
                if(root.left!=null)q.offer(root.left);
                if(root.right!=null)q.offer(root.right);
                size--;
            }
            if(sum>=max){
                max = sum;
                l = level; 
            }
            level++;
            sum=0;
        }
        return l;
    }
}
}