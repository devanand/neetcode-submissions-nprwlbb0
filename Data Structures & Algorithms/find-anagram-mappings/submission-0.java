class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        Map<Integer, List<Integer>> buffer = new HashMap<>();
        for(int i=0; i < nums2.length; i++) {
            int num = nums2[i];
            buffer.computeIfAbsent(num, k -> new ArrayList<>()).add(i);
        }

        int output[] = new int[nums1.length];
        for (int i=0; i < nums1.length; i++) {
            if (buffer.containsKey(nums1[i])) {
                List<Integer> indices = buffer.get(nums1[i]);
                output[i] = indices.get(0);
                indices.removeFirst();
                if (indices.isEmpty()) {
                    buffer.remove(nums1[i]);
                }
            }
        }
        return output;
    }
}
