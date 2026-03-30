class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroCount = 0;
        
        for (int num : nums) {
            if (num == 0) zeroCount++;
            else product *= num;
        }

        if (zeroCount > 1) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = 0;
            }
            return nums;
        }

        for (int i = 0; i < nums.length; i++) {
            if (zeroCount == 1) {
                if (nums[i] == 0) {
                    nums[i] = product;
                } else {
                    nums[i] = 0;
                }
            } else {
                nums[i] = product/nums[i];
            }
        }

        return nums;
    }
}  
