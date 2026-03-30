class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lb = search(nums, target, true);
        int ub = lb != -1 ? search(nums, target, false) : -1;
        return new int[]{lb, ub};
    }

    public int search(int[] nums, int target, boolean searchFirst) {
        int left = 0, right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                if (searchFirst) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
                result = mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }
}