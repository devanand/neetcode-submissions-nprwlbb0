class Solution {
    public int numWays(int n, int k) {
        if (n == 1) {
            return k;
        }
        int antepenultimate = k;
        int penultimate = k * k;
        for (int i = 3; i <= n; i++) {
            int current = (k-1) * (penultimate + antepenultimate);
            antepenultimate = penultimate;
            penultimate = current;
        }
        return penultimate;
    }
}
