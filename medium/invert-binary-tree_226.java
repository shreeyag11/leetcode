// Invert a binary tree.

// Example:

// Input:

//      4
//    /   \
//   2     7
//  / \   / \
// 1   3 6   9
// Output:

//      4
//    /   \
//   7     2
//  / \   / \
// 9   6 3   1
// Trivia:
// This problem was inspired by this original tweet by Max Howell:

// Google: 90% of our engineers use the software you wrote (Homebrew), but you can’t invert a binary tree on a whiteboard so f*** off.

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
// class Solution {
//     public TreeNode invertTree(TreeNode root) {
//         if (root == null)
//             return root;
//         if (root.left != null || root.right != null) {
//             TreeNode temp = root.right;
//             root.right = root.left;
//             root.left = temp;
//         }
//         invertTree(root.left);
//         invertTree(root.right);
//         return root;
//     }
// }

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()) {
            if (root.left != null)
                st.push(root.left);
            if (root.right != null)
                st.push(root.right);
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = temp;
            root = st.pop();
        }

        return root;
    }
}
