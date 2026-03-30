class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lb = search(nums, target, true);
        int ub = lb != -1 ? search(nums, target, false) : -1;
        return new int[]{lb, ub};
    }

    public int search(int[] nums, int target, boolean searchFirst) {
        int start = 0, end = nums.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                if (searchFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                result = mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }
}