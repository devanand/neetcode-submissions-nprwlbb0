class MovingAverage {
    private List<Integer> buffer;
    private int size;
    public MovingAverage(int size) {
        this.size = size;
        buffer = new ArrayList<>();
    }
    
    public double next(int val) {
        buffer.add(val);
        int currentSize = buffer.size();
        int start = currentSize > size ? currentSize - size : 0;
        int total = 0;
        for (; start < currentSize; start++) {
            total += buffer.get(start);
        }
        double finalTotal = total;
        double denom = currentSize < size  ? currentSize : size;
        double result = finalTotal/denom;
        return result;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
