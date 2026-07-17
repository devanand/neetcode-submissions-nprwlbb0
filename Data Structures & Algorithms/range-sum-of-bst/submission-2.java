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
    int output = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        rangeSumBst(root, low, high);
        return output;
    }

    private void rangeSumBst(TreeNode root, int low, int high) {
        if (root == null) {
            return;
        }

        if (root.val >= low && root.val <= high) {
            output += root.val;
        }
        rangeSumBst(root.left, low, high);
        rangeSumBst(root.right, low, high);
    }
}