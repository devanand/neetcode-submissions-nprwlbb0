class Solution {
    public int uniquePaths(int m, int n) {
        int prev[] = new int[n];
        for (int i = 0; i < m; i++) {
            int current[] = new int[n];
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    current[j] = 1;
                    continue;
                }
                int left = j == 0 ? 0 : current[j - 1];
                int top = i == 0 ? 0 : prev[j];
                current[j] = left + top;
            }
            prev = current;
        }
        return prev[n - 1];
    }
}
