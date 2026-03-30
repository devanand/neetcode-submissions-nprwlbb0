class Solution {
    public boolean isMajorityElement(int[] nums, int target) {
        int first = -1;
        int n = nums.length;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

            if (nums[mid] == target) {
                first = mid;
            }
        }

        return first != -1 && first + n/2 < n && nums[first + n / 2] == target;
    }
}
