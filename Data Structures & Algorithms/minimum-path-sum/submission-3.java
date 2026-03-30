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

    private int minPathSum(int[][] grid, int row, int column) {
        if (row < 0 || column < 0) {
            return (int) 1e9;
        }
        if (row == 0 && column == 0) {
            return grid[row][column];
        }
        if (dp[row][column] != null) {
            return dp[row][column];
        }
        int up = minPathSum(grid, row - 1, column);
        int left = minPathSum(grid, row, column - 1);
        return dp[row][column] = grid[row][column] + Math.min(up, left);
    }
}