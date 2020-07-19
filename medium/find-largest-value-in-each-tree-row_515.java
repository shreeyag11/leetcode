import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// You need to find the largest value in each row of a binary tree.

// Example:
// Input: 

//           1
//          / \
//         3   2
//        / \   \  
//       5   3   9 

// Output: [1, 3, 9]

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class LargestValue {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root != null)
            q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            int max = Integer.MIN_VALUE;
            while (size > 0) {
                root = q.poll();
                if (root.val > max)
                    max = root.val;
                if (root.left != null)
                    q.offer(root.left);
                if (root.right != null)
                    q.offer(root.right);
                size--;
            }
            res.add(max);
        }
        return res;
    }
}