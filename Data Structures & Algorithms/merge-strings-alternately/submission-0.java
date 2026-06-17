class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] word1Arr = word1.toCharArray();
        char[] word2Arr = word2.toCharArray();
        StringBuilder output = new StringBuilder();
        int i = 0, j = 0;
        for (; i < word1Arr.length && j < word2Arr.length; i++, j++) {
            output.append(word1Arr[i]);
            output.append(word2Arr[j]);
        }
        while (i < word1Arr.length) {
            output.append(word1Arr[i]);
            i++;
        }
        while (j < word2Arr.length) {
            output.append(word2Arr[j]);
            j++;
        }
        return output.toString();
    }
}