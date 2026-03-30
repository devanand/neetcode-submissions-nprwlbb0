class Solution {
    public int scoreOfString(String s) {
        short output = 0;
        for (int i = 1; i < s.length(); i++) {
            output += Math.abs(s.charAt(i - 1) - s.charAt(i));
        }
        return output;
    }
}