class Solution {
    public int smallestCommonElement(int[][] mat) {
        Map<Integer, Integer> buffer = new HashMap<>();
        int minKey = Integer.MAX_VALUE;
        boolean minKeyFound = false;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                buffer.merge(mat[i][j], 1, Integer::sum);
            }
        }

        for (Map.Entry<Integer, Integer> entry : buffer.entrySet()) {
            int v = entry.getValue();
            int k = entry.getKey();
            if (v != mat.length) continue;
            if (k < minKey) {
                minKey = k;
                minKeyFound = true;
            } 
        }
        return minKeyFound ? minKey : -1;
    }
}
