class Solution {
    public int largestUniqueNumber(int[] nums) {
        int ans = -1;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; ) {
            if (i + 1 < nums.length && nums[i+1] == nums[i]) {
                i += 2;
                continue;
            }
            ans = nums[i];
            i++;
        }
        return ans;
    }
}
