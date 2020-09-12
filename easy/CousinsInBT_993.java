package easy;

import java.util.LinkedList;
import java.util.Queue;

public class CousinsInBT_993 {
    /**
     * Definition for a binary tree node. public class TreeNode { int val; TreeNode
     * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
     * = left; this.right = right; } }
     */
    class Solution {
        public boolean isCousins(TreeNode root, int x, int y) {
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            TreeNode xnode = null;
            TreeNode ynode = null;
            while (!q.isEmpty()) {
                int size = q.size();
                while (size-- > 0) {
                    root = q.poll();
                    if (root.left != null) {
                        q.offer(root.left);
                        if (root.left.val == x)
                            xnode = root;
                        if (root.left.val == y)
                            ynode = root;
                    }
                    if (root.right != null) {
                        q.offer(root.right);
                        if (root.right.val == x)
                            xnode = root;
                        if (root.right.val == y)
                            ynode = root;
                    }
                    if (xnode != null && ynode != null)
                        break;
                }
                if (xnode != null && ynode != null)
                    return xnode != ynode;
                if ((xnode != null && ynode == null) || (xnode == null && ynode != null))
                    return false;
            }
            return false;
        }
    }
}

// In a binary tree, the root node is at depth 0, and children of each depth k
// node are at depth k+1.

// Two nodes of a binary tree are cousins if they have the same depth, but have
// different parents.

// We are given the root of a binary tree with unique values, and the values x
// and y of two different nodes in the tree.

// Return true if and only if the nodes corresponding to the values x and y are
// cousins.

// Example 1:

// Input: root = [1,2,3,4], x = 4, y = 3
// Output: false
// Example 2:

// Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
// Output: true
// Example 3:

// Input: root = [1,2,3,null,4], x = 2, y = 3
// Output: false

// Constraints:

// The number of nodes in the tree will be between 2 and 100.
// Each node has a unique integer value from 1 to 100.