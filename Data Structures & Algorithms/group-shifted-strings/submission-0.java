class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String s : strings) {
            String key = signature(s);
            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(groups.values());
    }

     private String signature(String s) {
        int n = s.length();
        if (n <= 1) return ""; 

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < n; i++) {
            int prev = s.charAt(i - 1) - 'a';
            int curr = s.charAt(i) - 'a';
            int diff = (curr - prev + 26) % 26;
            sb.append(diff).append('#');
        }
        return sb.toString();
    }
}
