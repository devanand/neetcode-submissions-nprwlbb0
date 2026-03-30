class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> buffer = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!buffer.add(nums[i])) {
                return true;
            }
            if (buffer.size() > k) {
                buffer.remove(nums[i - k]);
            }
        }
        
        return false;
    }
}