// Find the sum of all left leaves in a given binary tree.

// Example:

//     3
//    / \
//   9  20
//     /  \
//    15   7

// There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        return sumHelper(root, false);
    }

    public int sumHelper(TreeNode root, boolean bool) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null) {
            if (bool)
                return root.val;
        }
        return sumHelper(root.left, true) + sumHelper(root.right, false);
    }
}