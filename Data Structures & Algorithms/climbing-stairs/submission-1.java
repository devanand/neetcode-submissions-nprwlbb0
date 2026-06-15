class Solution {
    public int climbStairs(int n) {
        int first = 1, second = 2;
        if (n == 1) return first;
        if (n == 2 )return second;
        for (int i = 3; i <= n; i++) {
            int current = first + second;
            first = second;
            second = current;
        }
        return second;
    }
}
