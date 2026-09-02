class FirstUnique {
    Map<Integer, Integer> freqMap = new HashMap<>();
    List<Integer> numbers = new ArrayList<>();
    public FirstUnique(int[] nums) {
        for (int num : nums) {
            numbers.add(num);
            freqMap.merge(num, 1, Integer::sum);
        }
    }
    
    public int showFirstUnique() {
        for (int num : numbers) {
            if (freqMap.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
    
    public void add(int value) {
        numbers.add(value);
        freqMap.merge(value, 1, Integer::sum);
    }
}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */
