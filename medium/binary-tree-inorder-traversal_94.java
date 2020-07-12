import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// Given a binary tree, return the inorder traversal of its nodes' values.

// Example:

// Input: [1,null,2,3]
//    1
//     \
//      2
//     /
//    3

// Output: [1,3,2]
// Follow up: Recursive solution is trivial, could you do it iteratively?

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class InorderIterator {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !st.isEmpty()) {
            while (curr != null) {
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
    }
}