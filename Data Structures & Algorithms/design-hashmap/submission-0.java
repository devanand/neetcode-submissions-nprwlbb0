class MyHashMap {
    
    private final Node[] parent;
    private static final int SIZE = 1000;
    public MyHashMap() {
        parent = new Node[SIZE];
    }
    
    public void put(int key, int value) {
        int hash = hash(key);
        Node bucketStart = parent[hash];
        if (bucketStart == null) {
            parent[hash] = new Node(key, value);
            return;
        }
        do {
            if (bucketStart.key == key) {
                bucketStart.value = value;
                return;
            }
            if (bucketStart.next == null) {
                break;
            }
            bucketStart = bucketStart.next;
        } while (bucketStart != null);
        Node newNode = new Node(key, value);
        bucketStart.next = newNode;
        newNode.prev = bucketStart;
    }
    
    public int get(int key) {
        int hash = hash(key);
        Node bucketStart = parent[hash];
        while (bucketStart != null && bucketStart.key != key) {
            bucketStart = bucketStart.next;
        }
        return bucketStart != null ? bucketStart.value : -1;
    }
    
    public void remove(int key) {
        int hash = hash(key);
        Node curr = parent[hash];
        Node prev = null;
        while (curr != null && curr.key != key) {
            prev = curr;
            curr.next = curr;
        }
        if (curr == null) {
            return;
        }

        if (prev == null) {
            parent[hash] = curr.next;
        } else {
            prev.next = curr.next;
        }
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public static class Node {
        Node prev;
        int key;
        int value;
        Node next;
        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */