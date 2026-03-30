class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        Set<String> operators = Set.of("+", "-", "*", "/");
        for (String token : tokens) {
            if (operators.contains(token)) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                switch(token) {
                    case "+":
                        stack.push(operand1 + operand2);
                        break;
                    case "*":
                        stack.push(operand1 * operand2);
                        break;
                    case "-":
                        stack.push(operand1 - operand2);
                        break;
                    case "/":
                        stack.push(operand1 / operand2);
                        break;
                }
                continue;
            }
            stack.push(Integer.parseInt(token));
        }
        return stack.pop();
    }
}
