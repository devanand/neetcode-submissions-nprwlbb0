class LRUCache {
    private final Map<Integer, Node> map;
    private final Node sentinelStart;
    private final Node sentinelEnd;
    private final int capacity;
    
    public static class Node {
        int key;
        int value;
        Node prev;
        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    public LRUCache(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity should be at least 1");
        }
        map = new HashMap<>();
        sentinelStart = new Node(-1, -1);
        sentinelEnd = new Node(-1, -1); 
        this.capacity = capacity;
        initializeNodes();
    }
    
    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        Node node = map.get(key);
        removeNodeFromCurrentPosition(node);
        insertAtTheBeginning(node); 
        return node.value;  
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            get(key);
            Node node = map.get(key);
            node.value = value;
            return;
        }
        Node node = new Node(key, value);
        map.put(key, node);
        insertAtTheBeginning(node);

        if (map.size() > capacity) {
            Node last = sentinelEnd.prev;
            removeNodeFromCurrentPosition(last);
            map.remove(last.key);
        }   
    }

    private void initializeNodes() {
        
        sentinelStart.next = sentinelEnd;
        sentinelEnd.prev = sentinelStart;
    }

    private void removeNodeFromCurrentPosition(Node node) {
        Node next = node.next;
        Node prev = node.prev;
        prev.next = next;
        next.prev = prev;
        node.next = null;
        node.prev = null;
    }

    private void insertAtTheBeginning(Node node) {
        node.prev = sentinelStart;
        Node next = sentinelStart.next;
        sentinelStart.next = node;
        next.prev = node;
        node.next = next;
    }
}
