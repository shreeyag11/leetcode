// Consider all the leaves of a binary tree.  From left to right order, the values of those leaves form a leaf value sequence.

// For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).

// Two binary trees are considered leaf-similar if their leaf value sequence is the same.

// Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.

// Constraints:

// Both of the given trees will have between 1 and 200 nodes.
// Both of the given trees will have values between 0 and 200

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> res1 = new ArrayList<>();
        List<Integer> res2 = new ArrayList<>();
        leafy(root1, res1);
        leafy(root2, res2);
        return res1.equals(res2);
    }

    public List<Integer> leafy(TreeNode root, List<Integer> res) {
        if (root == null)
            return null;
        if (root.left == null && root.right == null)
            res.add(root.val);
        leafy(root.left, res);
        leafy(root.right, res);
        return res;
    }
}