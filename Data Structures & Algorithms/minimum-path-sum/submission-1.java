class Solution {
    Integer dp[][];
    public int minPathSum(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;
        dp = new Integer[rows][columns];
        return minPathSum(grid, rows - 1, columns - 1);
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