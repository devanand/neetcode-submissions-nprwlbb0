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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int a = p.val, b = q.val;

        TreeNode current = root;

        while (current != null) {
            if (a < current.val && b < current.val) {
                current = current.left;
            } else if (a > current.val && b > current.val) {
                current = current.right;
            } else {
                return current;
            }

        }
        return null;
    }
}
