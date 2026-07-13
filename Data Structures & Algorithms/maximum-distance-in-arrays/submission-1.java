class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int output = 0;
        int n = arrays.size();
        List<Integer> current = arrays.get(0);
        int currentMin = current.get(0);
        int currentMax = current.get(current.size() - 1);
        for (int i = 1; i < n; i++) {
            current = arrays.get(i);
            int len = current.size();
            int min = current.get(0), max = current.get(len - 1);
            int diff1 = Math.abs(min - currentMax);
            int diff2 = Math.abs(max - currentMin);
            output = Math.max(output, Math.max(diff1, diff2));
            currentMin = Math.min(currentMin, min);
            currentMax = Math.max(currentMax, max);
        }
        
        return output;
    }
}
