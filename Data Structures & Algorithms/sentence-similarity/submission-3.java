class Solution {
    public boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
        if (sentence1.length != sentence2.length) {
            return false;
        }
        Map<String, Set<String>> map = new HashMap<>();
        similarPairs.forEach(pair -> {
            String key = pair.get(0);
            String value = pair.get(1);
            if (map.containsKey(key)) {
                map.get(key).add(value);
            } else if (map.containsKey(value)) {
                map.get(value).add(key); 
            } else {
                map.put(key, new HashSet<>());
                map.get(key).add(value);
            }
        });
        for (int i = 0; i < sentence1.length; i++) {
            String s1 = sentence1[i];
            String s2 = sentence2[i];
            if (!s1.equals(s2) && !isEqual(s1, s2, map)) {
                return false;
            }
            
        }
        return true;
    }

    public boolean isEqual(String s1, String s2, Map<String, Set<String>> map) {
        if (map.containsKey(s1)) {
            Set<String> values = map.get(s1);
            if (values.contains(s2)) {
            return true;
            }
        } 
        if (map.containsKey(s2)) {
            Set<String> values = map.get(s2);
            if (values.contains(s1)) {
                return true;
            }
        }
        return false;
    }
}
