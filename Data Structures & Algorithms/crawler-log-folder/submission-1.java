class Solution {
    public int minOperations(String[] logs) {
        Stack<String>stack = new Stack<>();
        for (String log: logs) {
            if (log.equals("../")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                continue;
            }
            if (log.equals("./")) {
                continue;
            }
            stack.push(log);
        }
        return stack.size();
    }
}