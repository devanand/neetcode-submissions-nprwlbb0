class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] buffer = new int[cost.length + 1];
        buffer[0] = 0;
        buffer[1] = 0;
        for (int i = 2; i <= cost.length; i++) {
            int cost1 = buffer[i-2] + cost[i-2];
            int cost2 = buffer[i-1] + cost[i-1];
            buffer[i] = Math.min(cost1, cost2);
        }
        return buffer[cost.length];
    }
}
