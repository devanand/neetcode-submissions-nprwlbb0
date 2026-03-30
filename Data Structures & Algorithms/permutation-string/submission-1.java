class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        
        int[] s1Frequency = new int[26];
        int[] s2Frequency = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1Frequency[s1.charAt(i) - 'a']++;
            s2Frequency[s2.charAt(i) - 'a']++;
        }
        int matches = 0;
        for (int i = 0; i <s1Frequency.length; i++) {
            if (s1Frequency[i] == s2Frequency[i]) {
                matches++;
            }
        }
        if (matches == 26) return true;
        for (int i = s1.length(); i < s2.length(); i++) {
            char charToAdd = s2.charAt(i);
            int charToAddIdx = charToAdd - 'a';
            if (s2Frequency[charToAddIdx] == s1Frequency[charToAddIdx]) {
                matches--;
            }
            s2Frequency[charToAddIdx]++;
            if (s2Frequency[charToAddIdx] == s1Frequency[charToAddIdx]) {
                matches++;
            }
            
                char charToRemove = s2.charAt(i - s1.length());
                int charToRemoveIdx = charToRemove - 'a';
                if (s2Frequency[charToRemoveIdx] == s1Frequency[charToRemoveIdx]) {
                    matches--;
                }
                s2Frequency[charToRemoveIdx]--;
                if (s2Frequency[charToRemoveIdx] == s1Frequency[charToRemoveIdx]) {
                    matches++;
                }
            
            
            if (matches == 26) {
                return true;
            } 
        }
        return false;
    }
}
