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
        if (root == null) return false;
        Stack<TreeNode> nodes = new Stack<>();
        Stack<Integer> target = new Stack<>();
        nodes.push(root);
        target.push(targetSum - root.val);
        while (!nodes.isEmpty()) {
            TreeNode current = nodes.pop();
            int currentTarget = target.pop();
            if (current.left == null && current.right == null && currentTarget == 0) {
                return true;
            }
            
            if (current.left != null) {
                nodes.push(current.left);
                target.push(currentTarget - current.left.val);
            }

            if (current.right != null) {
                nodes.push(current.right);
                target.push(currentTarget - current.right.val);
            }
        }
        return false;
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