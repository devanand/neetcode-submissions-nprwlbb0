class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int smallest = 1;
        for (int num : nums) {
            if (num <= 0 || num < smallest) {
                continue;
            }
            if (num != smallest) {
                return smallest;
            }
            smallest++;            
        }
        return smallest;
    }
}