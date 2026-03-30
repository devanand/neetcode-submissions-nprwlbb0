class Solution {
    public int maxArea(int[] heights) {
        int maxQuantity = 0;
        for (int i=0, j = heights.length - 1; i<j;) {
            int a = heights[i];
            int b = heights[j];
            int quantity = (j-i) * Math.min(a, b);
            maxQuantity = Math.max(maxQuantity, quantity);
            if (a < b) {
                i++;
            } else {
                j--;
            }
        }
        return maxQuantity;
    }
}
