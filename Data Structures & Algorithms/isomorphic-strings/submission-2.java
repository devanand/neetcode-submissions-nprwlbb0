class Solution {
    public boolean isIsomorphic(String s, String t) {
        return helper(s, t) && helper(t, s);
    }

    private boolean helper(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> buffer = new HashMap<>();
        s = s.toLowerCase();
        t = t.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);
            if (buffer.containsKey(s1) && buffer.get(s1) != t1) {
                return false;
            }
            buffer.put(s1, t1);
        }
        return true;
    }

}