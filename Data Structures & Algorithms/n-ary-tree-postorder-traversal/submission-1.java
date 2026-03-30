/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> output = new ArrayList<>();
        if (root == null) return output;
        Stack <Node>s1 = new Stack<>();
        Stack <Node>s2 = new Stack<>();
        s1.push(root);
        while (!s1.isEmpty()) {
            Node node = s1.pop();
            s2.push(node);
            for (Node n : node.children) {
                s1.push(n);
            }
        }
        while (!s2.isEmpty()) {
            output.add(s2.pop().val);
        }
        return output;
    }
}