class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int currentElement = nums[0], currentCount = 0, maxElement = currentElement;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != currentElement) {
                if (max < currentCount) {
                    max = currentCount;
                    maxElement = currentElement;
                    
                } 
                currentElement = nums[i];
                currentCount = 1;
            }
            else {
                currentCount++;
                if (i == nums.length - 1 && (max < currentCount)) {
                    max = currentCount;
                    maxElement = currentElement;
                    currentElement = nums[i];
                    currentCount = 0;
                }
            }
        }
        return maxElement;
    }
}