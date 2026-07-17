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
    int maxLength = 0;
    public int longestConsecutive(TreeNode root) {
        longest(root, null, 0);
        return maxLength;
    }

    public void longest(TreeNode root, TreeNode parent, int length) {
        if (root == null) {
            return;
        }
        length = parent != null && parent.val +1 == root.val ? length+1 : 1;
        maxLength = Math.max(maxLength, length);
        longest(root.left, root, length);
        longest(root.right, root,length);
    }
}
