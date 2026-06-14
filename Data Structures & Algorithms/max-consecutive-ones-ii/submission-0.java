class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left = 0, right = 0, zeroCount = 0, maxLen = 0;
        while (right < nums.length) {
            if (nums[right] == 0) {
                zeroCount++;
            }
            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            maxLen = Math.max(right - left + 1, maxLen);
            right++;
        }
        return maxLen;
    }
}
