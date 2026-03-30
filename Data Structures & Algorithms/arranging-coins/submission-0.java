class Solution {
    public int arrangeCoins(int n) {
        long left = 0, right = n;  // use long to avoid overflow
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long need = mid * (mid + 1) / 2;

            if (need == n) return (int) mid;
            if (need < n) left = mid + 1;
            else right = mid - 1;
        }
        return (int) right;
    }
}