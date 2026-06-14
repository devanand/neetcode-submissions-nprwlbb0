class Solution {
    public int minimumDifference(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int l = 0, r = k - 1; r <nums.length; l++, r++) {
            min = Math.min(min, nums[r] - nums[l]);
        }
        return min;
    }
}