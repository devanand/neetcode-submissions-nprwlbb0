class Solution {
    public int maxDifference(String s) {
        int oddFrequency = 0, evenFrequency = Integer.MAX_VALUE;
        int[] buffer = new int[26];
        for (char c : s.toCharArray()) {
            buffer[c - 97]++;
        }

        for (int a : buffer) {
            if (a == 0) {
                continue;
            }
            if (a % 2 == 0 && a < evenFrequency) {
                evenFrequency = a;
            }
            if (a % 2 == 1 && a > oddFrequency) {
                oddFrequency = a;
            } 
        }

        return oddFrequency - evenFrequency;
    }
}