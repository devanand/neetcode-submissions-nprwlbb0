class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> buffer = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (buffer.containsKey(nums[i])) {
                int prevIndex = buffer.get(nums[i]);
                if (Math.abs(prevIndex - i) <= k) {
                    return true;
                }
            }
            buffer.put(nums[i], i);                
        }
        
        return false;
    }
}