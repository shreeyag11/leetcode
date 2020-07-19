import java.util.HashMap;

// Given preorder and inorder traversal of a tree, construct the binary tree.

// Note:
// You may assume that duplicates do not exist in the tree.

// For example, given

// preorder = [3,9,20,15,7]
// inorder = [9,3,15,20,7]
// Return the following binary tree:

//     3
//    / \
//   9  20
//     /  \
//    15   7

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class BuildTreeFromPreAndInorder {
    HashMap<Integer, Integer> map = new HashMap<>();
    int index;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        index = 0;
        for (int i = 0; i < inorder.length; i++)
            map.put(inorder[i], i);
        return helpers(preorder, inorder, 0, preorder.length - 1);
    }

    public TreeNode helpers(int[] preorder, int[] inorder, int lo, int hi) {
        if (lo > hi)
            return null;
        int val = preorder[index++];
        TreeNode root = new TreeNode(val);
        int cut = map.get(val);
        root.left = helpers(preorder, inorder, lo, cut - 1);
        root.right = helpers(preorder, inorder, cut + 1, hi);
        return root;
    }
}