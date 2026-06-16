class MyQueue {
    Stack<Integer> queue;
    Stack<Integer> backupQueue;
    public MyQueue() {
        queue = new Stack();
        backupQueue = new Stack();
    }
    
    public void push(int x) {
        queue.push(x);
    }
    
    public int pop() {
        refill();
        return backupQueue.pop();
    }
    
    public int peek() {
        refill();
        return backupQueue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty() && backupQueue.isEmpty();
    }

    private void refill() {
        if (backupQueue.isEmpty()) {
            while (!queue.isEmpty()) {
                backupQueue.push(queue.pop());
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */