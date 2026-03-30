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
    double nearest[] = new double[1];
    int val;
    public int closestValue(TreeNode root, double target) {
        nearest[0] = Integer.MAX_VALUE;
        nearest(root, target);
        return val;
    }

    public void nearest(TreeNode root, double target) {
        if (root == null) {
            return;
        }
        double diff = Math.abs(target - (double)(root.val));
        if (nearest[0] > diff) {
            nearest[0] = diff;
            val = root.val;
        }
        nearest(root.left, target);
        nearest(root.right, target);
    }
}
