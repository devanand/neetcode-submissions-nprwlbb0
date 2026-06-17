class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < nums1.length; i++) {
            int updatedIndex = i - m;
            int elementToAdd = nums2[updatedIndex];
            nums1[i] = elementToAdd;
        }
        Arrays.sort(nums1);
    }
}