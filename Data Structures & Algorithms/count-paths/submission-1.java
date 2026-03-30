class Solution {
    public int uniquePaths(int m, int n) {
        int prev[] = new int[n];
        for (int i = 0; i < m; i++) {
            int current[] = new int[n];
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    current[j] = 1;
                    continue;
                } else {
                    current[j] = prev[j] + current[j -1];
                }                
            }
            prev = current;
        }
        return prev[n - 1];
    }
}
