class Solution {
    public int countElements(int[] arr) {
        Set<Integer> buffer = new HashSet<>();
        for (int num: arr) {
            buffer.add(num);
        }
        int count = 0;
        for (int num: arr) {
            if (buffer.contains(num + 1)) {
                count++;
            }
        }
        return count;
    }
}
