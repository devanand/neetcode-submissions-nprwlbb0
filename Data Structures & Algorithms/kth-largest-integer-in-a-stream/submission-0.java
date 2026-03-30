class KthLargest {
    private int[] nums;
    private int k;
    PriorityQueue<Integer> priorityQueue;
    public KthLargest(int k, int[] nums) {
        this.nums = nums;
        this.k = k;
        priorityQueue = new PriorityQueue<>(k);

        for (int num: nums) {
            add(num);
        }
    }
    
    public int add(int val) {
        if (priorityQueue.size() < k) {
            priorityQueue.offer(val);
        } else if (priorityQueue.peek() < val) {
            priorityQueue.poll();
            priorityQueue.offer(val);
        }
        return priorityQueue.peek();
    }
}
