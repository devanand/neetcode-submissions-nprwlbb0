class StringIterator {
    private String compressed;
    private int ptr = 0, num = 0;
    char ch;
    public StringIterator(String compressed) {
        this.compressed = compressed;  
    }
    
    public char next() {
        if (!hasNext()) {
            return ' ';
        }

        if (num == 0) {
            ch = compressed.charAt(ptr);
            ptr++;
            while(ptr < compressed.length() && Character.isDigit(compressed.charAt(ptr))) {
                num = num * 10 + (compressed.charAt(ptr) - '0');
                ptr++;
            }
        }
        num--;
        return ch;
    }
    
    public boolean hasNext() {
        return ptr != compressed.length() || num != 0;
    }
}

/**
 * Your StringIterator object will be instantiated and called as such:
 * StringIterator obj = new StringIterator(compressedString);
 * char param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
