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
        //rangeSumBst(root, low, high);
        Stack<TreeNode> buffer = new Stack<>();
        buffer.push(root);
        while (!buffer.isEmpty()) {
            TreeNode node = buffer.pop();
            if (node.val >= low && node.val <= high) {
                output += node.val;
            }
            if (node.left != null) {
                buffer.push(node.left);
            }
            if (node.right != null) {
                buffer.push(node.right);
            }
        }
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