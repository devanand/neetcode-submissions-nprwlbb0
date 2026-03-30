class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        } 
        if (t.length() == 0) {
            return false;
        }
        int subStrPointer = 0;
        for (int i = 0; i < t.length(); i++) {
            char charToCheck = s.charAt(subStrPointer);
            if (charToCheck == t.charAt(i)) {
                subStrPointer++;
                if (subStrPointer >= s.length()) {
                    break;
                }
            }
        }
        return subStrPointer == s.length();
    }
}