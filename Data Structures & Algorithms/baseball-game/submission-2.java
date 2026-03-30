class Solution {
    public int calPoints(String[] operations) {
        int output = 0;
        Stack<Integer> stack = new Stack<>();
        for (String op: operations) {
            if (op.equals("+")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                int sum = num1 + num2;
                stack.push(num2);
                stack.push(num1);
                stack.push(sum);
            } else if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(stack.peek() * 2);
            } else {
                stack.push(Integer.parseInt(op));
            }
        }
        while (!stack.isEmpty()) {
            output += stack.pop();
        }
        return output;
    }
}