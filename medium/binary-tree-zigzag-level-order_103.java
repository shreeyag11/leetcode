import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

// For example:
// Given binary tree [3,9,20,null,null,15,7],
//     3
//    / \
//   9  20
//     /  \
//    15   7
// return its zigzag level order traversal as:
// [
//   [3],
//   [20,9],
//   [15,7]
// ]

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;
        q.add(root);
        int i = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> ans = new ArrayList<>();
            while (size > 0) {
                root = q.poll();
                if (i % 2 != 0)
                    ans.add(0, root.val);
                else
                    ans.add(root.val);
                if (root.left != null)
                    q.add(root.left);
                if (root.right != null)
                    q.add(root.right);
                size--;
            }
            res.add(ans);
            i++;
        }
        return res;
    }
}