class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, current = 0;
        for (int num : nums) {
            current = num == 1 ? current + 1 : 0;
            max = Math.max(max, current);
        }
        return max;
    }
}