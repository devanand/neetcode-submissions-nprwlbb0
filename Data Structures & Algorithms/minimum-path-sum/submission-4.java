class Solution {
    Integer dp[][];
    public int minPathSum(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[] prev = new int[cols];
        for (int row = 0; row < rows; row++) {
            int[] current = new int[cols];
            for (int col = 0; col < cols; col++) {
                 if (row == 0 && col == 0) {
                    current[col] = grid[row][col];
                    continue;
                 }
                 int up = row == 0 ? (int) 1e9 : prev[col];
                 int left = col == 0 ? (int) 1e9 : current[col - 1];
                 current[col] = grid[row][col] + Math.min(up, left);
                 
            }
            prev = current;
        }
        return prev[cols - 1];
    }
}