class Solution {
    public int lengthOfLastWord(String s) {
        boolean letterEncountered = false;
        int lastLength = 0;
        for (int i = s.length() - 1; i >=0; i--) {
            char c = s.charAt(i);
            if (c == ' ') {
                if (!letterEncountered) {
                    continue;
                }
                break;
            }
            letterEncountered = true;
            lastLength++;
        }
        return lastLength;
    }
}