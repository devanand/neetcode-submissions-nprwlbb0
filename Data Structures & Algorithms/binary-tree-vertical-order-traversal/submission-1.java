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
    public List<List<Integer>> verticalOrder(TreeNode root) {
        Map<Integer, List<int[]>> map = new HashMap<>();
        int minmax[] = new int[2];
        minmax[0] = Integer.MAX_VALUE;
        minmax[1] = Integer.MIN_VALUE;
        ordering(root, map, 0, 0, minmax);
        List<List<Integer>> output = new ArrayList<>();
        for (int i = minmax[0], j = minmax[1]; i <= j; i++) {
            List<int[]> vals = map.get(i);
            if (vals != null) {
                vals.sort(Comparator.comparing(a -> a[0]));
                List<Integer> colVals = new ArrayList<>();
                for (int[] a : vals) {
                    colVals.add(a[1]);
                }
                output.add(colVals);
            }
        }
        return output;    
    }

    private void ordering(TreeNode root, Map<Integer, List<int[]>> map, int order, int row, int[] minmax) {
        if (root == null) {
            return;
        }
        minmax[0] = Math.min(order, minmax[0]);
        minmax[1] = Math.max(order, minmax[1]);
        if (!map.containsKey(order)) {
            map.put(order, new ArrayList<>());
        }
        map.get(order).add(new int[]{row, root.val});
        ordering(root.left, map, order - 1, row + 1, minmax);
        ordering(root.right, map, order + 1, row + 1, minmax);
    }
}