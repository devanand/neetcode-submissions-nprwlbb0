class Solution {
    public String removeVowels(String s) {
        String output = "";
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                continue;
            }
            output += c;
        }
        return output;
    }
}
