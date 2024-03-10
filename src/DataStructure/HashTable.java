package DataStructure;

public class HashTable<K, V> {
    private class Node<K, V> {
        K key;
        V value;
        Node next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
            next = null;
        }
    }

    LinkedList<Node<K, V>>[] table;
    int size;
    int capacity;

    HashTable() {
        this.capacity = 12;
        table = new LinkedList[capacity];
        size = 0;
    }

    HashTable(int capacity) {
        this();
        this.capacity = capacity;
    }

    public int getIndex(K key) {
        return Math.abs(key.hashCode() % capacity);
    }

    public void put(K key, V value) {
        int index = getIndex(key);

        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        LinkedList<Node<K, V>> list = table[index];

        if (table[index] != null) {

            for (int i = 0; i < list.size(); i++) {
                Node<K, V> node = list.get(i);
                if (node.key.equals(key)) {
                    node.value = value;
                    return;
                }
            }
        }

        list.add(new Node(key, value));
        size++;
    }
}
