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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        

        return hasPathSum(root, 0, targetSum);

    }

    private boolean hasPathSum(TreeNode root, int currentSum, int targetSum) {
        if (root == null) {
            return false;
        }
        currentSum += root.val;
        if (root.left == null && root.right == null) {
            return currentSum == targetSum;
        }
        return hasPathSum(root.left, currentSum, targetSum) || hasPathSum(root.right, currentSum, targetSum);
    }
}