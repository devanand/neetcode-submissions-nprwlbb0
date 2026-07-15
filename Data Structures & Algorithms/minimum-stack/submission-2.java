class MinStack<T extends Comparable<T>> {

    private final Stack<T> stack;
    private final Stack<T> minStack;
    
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(T val) {
        stack.push(val);
        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            T min = val.compareTo(minStack.peek()) <= 0 ? val : minStack.peek();
            minStack.push(min);
        }
        
    }
    
    public void pop() {
        checkAndThrowExceptionIfStackIsEmpty();
        stack.pop();
        minStack.pop();
    }
    
    public T top() {
        checkAndThrowExceptionIfStackIsEmpty();
        return stack.peek();
    }
    
    public T getMin() {
        checkAndThrowExceptionIfStackIsEmpty();
        return minStack.peek();
    }

    private void checkAndThrowExceptionIfStackIsEmpty() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
    }
}
