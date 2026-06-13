class Solution {
    public int minimumRecolors(String blocks, int k) {
        char[] blockAr = blocks.toCharArray();
        int min = 0;
        for (int i = 0; i < k; i++) {
            if (blockAr[i] == 'W') {
                min++;
            }
        }
        int whites = min;
        for (int i = k; i < blocks.length(); i++) {
            if (blockAr[i] == 'W') {
                whites++;
            } 
            if (blockAr[i - k] == 'W') {
                whites--;
            }
            min = Math.min(min, whites);
        }
        return min;
    }
}