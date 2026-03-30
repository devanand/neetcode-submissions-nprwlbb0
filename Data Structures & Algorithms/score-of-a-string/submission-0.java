class Solution {
    public int scoreOfString(String s) {
        int output = 0;
        for (int i = 1; i < s.length(); i++) {
            int prev = s.charAt(i - 1);
            int curr = s.charAt(i);
            output += Math.abs(prev - curr);
        }
        return output;
    }
}