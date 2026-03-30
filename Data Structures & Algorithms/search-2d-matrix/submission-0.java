class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLength = matrix.length;
        int columnLength = matrix[0].length;
        int top = 0, bottom = rowLength - 1;

        while (top <= bottom) {
            int mid = top + (bottom - top) / 2;
            if (matrix[mid][0] == target) {
                return true;
            }
            if (matrix[mid][0] > target) {
                bottom = mid - 1;
            } else if (matrix[mid][0] < target && matrix[mid][columnLength - 1] < target) {
                top = mid + 1;
            } else {
                return search(matrix[mid], target);
            }
        }
        return false;
        
    }

    private boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // avoids overflow

            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] < target) {
                left = mid + 1;   // search right half
            } else {
                right = mid - 1;  // search left half
            }
        }

        return false; // target not found
    }
}
