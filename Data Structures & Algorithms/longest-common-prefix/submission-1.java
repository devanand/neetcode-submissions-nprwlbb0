class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        Arrays.sort(strs);
        int smallest = Math.min(strs[0].length(), strs[len-1].length()); 
        for (int i = 0; i < smallest; i++) {
            if (strs[0].charAt(i) != strs[len-1].charAt(i)) {
                return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }
}