class Logger {
    private final Map<String, Integer> buffer;
    
    public Logger() {
        buffer = new HashMap<>();
    }

    public boolean shouldPrintMessage(int timestamp, String message) {
        if (!buffer.containsKey(message)) {
            buffer.put(message, timestamp);
            return true;
        }

        boolean print = timestamp - buffer.get(message) >= 10;
        
        if (print) {
            buffer.put(message, timestamp);
        }
        return print;
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
