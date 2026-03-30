class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int best = 0;
        Map<Character, Integer> lastSeen = new HashMap<>();
        for (int right = 0; right < s.length(); right ++) {
            char c = s.charAt(right);
            if (lastSeen.containsKey(c) && lastSeen.get(c) >= left) {
                left = lastSeen.get(c) + 1;
            }
            lastSeen.put(c, right);
            best = Math.max(best, right - left + 1);
        }

        return best;
    }
}
