class MyHashSet {
    private final Map<Integer, Node> map;
    private final Node startSentinel;
    private final Node endSentinel;
    
    public MyHashSet() {
        map = new HashMap<>();
        
        startSentinel = new Node(-1);
        endSentinel = new Node(-1);
        
        startSentinel.next = endSentinel;
        endSentinel.prev = startSentinel;
    }
    
    public void add(int key) {
        if (map.containsKey(key)) {
            return;
        }
        Node node = new Node(key);
        map.put(key, node);
        
        Node prevNode = endSentinel.prev;
        //Add node after prevnon
        prevNode.next = node;
        node.prev = prevNode;

        //Set current node's next
        node.next = endSentinel;

        //Set end's previous
        endSentinel.prev = node;
    }
    
    public void remove(int key) {
        if (!map.containsKey(key)) {
            return;
        }
        Node node = map.get(key);
        map.remove(key);
        Node prevNode = node.prev;
        Node nextNode = node.next;
        node.prev = null;
        node.next = null;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }
    
    public boolean contains(int key) {
        return map.containsKey(key);
    }

    public static class Node {
        Node prev;
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */