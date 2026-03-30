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
    int preOrderPos = 0;
    Map<Integer, Integer> inOrderPosition;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        inOrderPosition = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inOrderPosition.put(inorder[i], i);
        }
        return buildTree(preorder, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int inLeft, int inRight) {
        if (inLeft > inRight) {
            return null;
        }

        int rootVal = preorder[preOrderPos++];
        TreeNode root = new TreeNode(rootVal);

        int mid = inOrderPosition.get(rootVal);

        root.left = buildTree(preorder, inLeft, mid -1);
        root.right = buildTree(preorder, mid + 1, inRight);

        return root;
    }
}
