class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0;
        int best = 0;
        int maxCount = 0;
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            int freqKey = currentChar - 'A';
            freq[freqKey]++;
            maxCount = Math.max(maxCount, freq[freqKey]);
            int windowLength = right - left + 1;
            while (windowLength - maxCount > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
                windowLength = right - left + 1;
            }
            best = Math.max(best, windowLength);
        }
        return best;
    }
}
