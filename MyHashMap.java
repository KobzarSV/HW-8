package ua.goit.HomeWork8;

import java.util.Arrays;

public class MyHashMap<K, V> {

    static final float DEFAULT_LOAD_FACTOR = 0.75f;
    private static final int DEFAULT_LENGTH = 16;
    private final int arrayLength;
    private int size;
    private Node<K, V>[] tables;

    public MyHashMap(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Длина инициализации должна быть больше 0");
        }
        this.arrayLength = length;
        tables = new Node[length];
    }

    public V get(Object key) {
        int index = indexForArray(hash(key), arrayLength);
        Node<K, V> node = tables[index];
        for (Node<K, V> n = node; n != null; n = n.next) {
            if ((key == null && null == n.getKey()) || (key != null && key.equals(n.getKey()))) {
                return n.value;
            }
        }
        return null;
    }

    public V put(K key, V value) {
        int hashCode = hash(key);
        int index = indexForArray(hashCode, arrayLength);
        Node<K, V> node = tables[index];
        if (node == null) {
            tables[index] = new Node(key, value, hashCode, null);
            size++;
        } else {
            for (Node<K, V> n = node; n != null; n = n.next) {
                K nodeKey = n.getKey();
                if ((key == null && null == nodeKey) || (key != null && key.equals(nodeKey))) {
                    V oldValue = n.getValue();
                    n.setValue(value);
                    return oldValue;
                }
                if (n.next == null) {
                    n.next = new Node<>(key, value, hashCode, null);
                    size++;
                    break;
                }
            }
        }
        return null;
    }

    public void clear() {
        tables = new Node[arrayLength];
        size = 0;
    }

    public int size() {
        return size;
    }

    public int hash(Object key) {
        return key == null ? 0 : key.hashCode();
    }

    private int indexForArray(int hashCode, int arrayLength) {
        int index = Math.abs(hashCode) % arrayLength;
        return index;
    }

    public V remove(K key) {
        if (size > 0) {
            if (key == null) {
                return removeForNullKey();
            }
            Node<K, V> first, n;
            K k;
            int i = getIndex(key), hash = hash(key);
            if ((first = tables[i]) != null) {
                if ((k = (K) first.key) == key || k.equals(key) && hash == first.hashCode) {
                    tables[i] = first.next;
                    size--;
                    return first.value == null ? null : (V) first.value;
                }
                if (first.next != null) {
                    for (n = first.next; n != null; n = n.next, first = first.next) {
                        if ((k = (K) n.key) == key || k.equals(key) && hash == n.hashCode) {
                            first.next = n.next;
                            size--;
                            return n.value == null ? null : (V) n.value;
                        }
                    }
                }
            }
        }
        return null;
    }

    private V removeForNullKey() {
        Node<K, V> n = tables[0];
        V result;
        if (n != null) {
            result = n.value == null ? null : (V) n.value;
            if (n.next == null) {
                tables[0] = null;
            } else {
                tables[0] = new Node<K, V>(null, null, hash(null), n.next);
            }
            size--;
            return result;
        }
        return null;
    }

    protected int getIndex(K key) {
        if (key == null) {
            return 0;
        }
        int hash = hash(key);
        return ((tables.length - 1) & hash);
    }

    @Override
    public String toString() {
        return "MyHashMap{" +
                "arrayLength=" + arrayLength +
                ", size=" + size +
                ", tables=" + Arrays.toString(tables) +
                '}';
    }

    static class Node<K, V> {
        private final K key;
        private V value;
        private Node<K, V> next;
        private int hashCode;

        public Node(K key, V value, int hashCode, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.hashCode = hashCode;
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public V setValue(V value) {
            this.value = value;
            return value;
        }

        @Override
        public String toString() {
            return key + "=" + value;
        }
    }
}
