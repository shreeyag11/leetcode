// Given a binary tree, find its minimum depth.

// The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

// Note: A leaf is a node with no children.

// Example:

// Given binary tree [3,9,20,null,null,15,7],

//     3
//    / \
//   9  20
//     /  \
//    15   7
// return its minimum depth = 2.

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    int min = Integer.MAX_VALUE;

    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left != null && root.right != null)
            return 1 + Math.min(minDepth(root.left), minDepth(root.right));
        else
            return 1 + Math.max(minDepth(root.left), minDepth(root.right));
    }
}