class Solution {
    public int maxProduct(int[] nums) {
        int result = nums[0];
        int currentMin = 1, currentMax = 1;
        for (int i = 0; i < nums.length; i++) {
            int tmpMax = currentMax * nums[i];
            int tmpMin = currentMin * nums[i];
            currentMax = Math.max(Math.max(tmpMax, tmpMin), nums[i]);
            currentMin = Math.min(Math.min(tmpMax, tmpMin), nums[i]);
            result = Math.max(result, currentMax);
        }
        return result;
    }
}
