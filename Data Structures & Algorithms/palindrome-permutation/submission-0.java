class Solution {
    public boolean canPermutePalindrome(String s) {
        int[] buffer = new int[26];
        for (char c: s.toCharArray()) {
            buffer[c - 'a']++;
        }
        int oddCount = 0;
        int evenCount = 0;
        for (int count: buffer) {
            if (count % 2 == 1) {
                oddCount++;
            } else {
                evenCount++;
            }
        }
        if (s.length() % 2 == 0) {
            return oddCount == 0;
        } else {
            return oddCount == 1;
        }
    }
}
