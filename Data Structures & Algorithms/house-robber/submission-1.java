class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int[] buffer = new int[nums.length];
        buffer[0] = nums[0];
        buffer[1] = nums[0] > nums[1] ? nums[0] : nums[1];
        for (int i = 2; i < nums.length; i++) {
            buffer[i] = Math.max(buffer[i - 1], buffer[i-2] + nums[i]);
        }
        return buffer[nums.length - 1];
    }
}
