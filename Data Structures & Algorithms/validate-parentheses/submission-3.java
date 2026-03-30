class Solution {
    public boolean isValid(String s) {
        Stack<Character> buffer = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                buffer.push(c);
            } else {
                if (buffer.isEmpty()) {
                    return false;
                }
                char top = buffer.pop();
                if ((c == ')' && top != '(')
                || (c == '}' && top != '{')
                || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return buffer.isEmpty();
    }
}
