/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    
    public boolean isBalanced(TreeNode root) {
        return heightDifference(root) != -1;
    }

    private int heightDifference(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = heightDifference(root.left);
        if (left == -1) {
            return -1;
        }

        int right = heightDifference(root.right);
        if (right == -1) {
            return -1;
        }

        if (Math.abs(right - left) > 1) {
            return -1;
        }

        return Math.max(left, right) + 1;
    }
}
