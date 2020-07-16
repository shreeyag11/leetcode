import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

// For example:
// Given binary tree [3,9,20,null,null,15,7],
//     3
//    / \
//   9  20
//     /  \
//    15   7
// return its bottom-up level order traversal as:
// [
//   [15,7],
//   [9,20],
//   [3]
// ]

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null)
            return res;
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> l1 = new ArrayList<>();
            while (size > 0) {
                TreeNode node = q.poll();
                l1.add(node.val);
                if (node.left != null)
                    q.offer(node.left);
                if (node.right != null)
                    q.offer(node.right);
                size--;
            }
            res.add(l1);
        }
        Collections.reverse(res);
        return res;
    }
}

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
// class Solution {
// public List<List<Integer>> levelOrderBottom(TreeNode root) {
// List<List<Integer>> res = new ArrayList<>();
// Queue<TreeNode> q = new LinkedList<>();
// if(root == null) return res;
// q.offer(root);
// while(!q.isEmpty()) {
// int size = q.size();
// List<Integer> l1 = new ArrayList<>();
// while(size>0){
// root = q.poll();
// l1.add(root.val);
// if(root.left!=null) q.offer(root.left);
// if(root.right!=null)q.offer(root.right);
// size--;
// }
// res.add(0,l1);
// }
// return res;
// }
// }