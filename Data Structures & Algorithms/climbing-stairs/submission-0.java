class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int previous = 2;
        int previousMinusOne = 1;
        for (int i = 3; i <= n; i++) {
            int current = previous + previousMinusOne;
            previousMinusOne = previous;
            previous = current;
        }
        return previous;
    }
}
