import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

// Given a binary tree, return the level order traversal of its nodes' values.
// (ie, from left to right, level by level).

// For example:
// Given binary tree [3,9,20,null,null,15,7],
// 3
// / \
// 9 20
// / \
// 15 7
// return its level order traversal as:
// [
// [3],
// [9,20],
// [15,7]
// ]

/**
 * Definition for a binary tree node.
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
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
        return res;

    }
}