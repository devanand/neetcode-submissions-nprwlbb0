class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length - 1, outputR = right;
        int[] output = new int[nums.length];
        while (left <= right) {
            int sqLeft = nums[left] * nums[left];
            int sqRight = nums[right] * nums[right];
            if (sqRight > sqLeft) {
                output[outputR--] = sqRight;
                right--;
            } else {
                output[outputR--] = sqLeft;
                left++;
            }
        }
        return output;
    }
}