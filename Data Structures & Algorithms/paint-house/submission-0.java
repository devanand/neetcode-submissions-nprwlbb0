class Solution {
    public int minCost(int[][] costs) {
        int rows = costs.length;
        int cols = costs[0].length;
        int dp0 = 0, dp1 = 0, dp2 = 0;

        for (int i = 0; i < costs.length; i++) {
            int newdp0 = costs[i][0] + Math.min(dp1, dp2);
            int newdp1 = costs[i][1] + Math.min(dp0, dp2);
            int newdp2 = costs[i][2] + Math.min(dp0, dp1);
            dp0 = newdp0;
            dp1 = newdp1;
            dp2 = newdp2;
        }
        return Math.min(dp0, Math.min(dp1, dp2));
    }

    
}