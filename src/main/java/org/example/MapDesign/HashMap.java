package org.example.MapDesign;

class Node<K, V> {
    K key;
    V value;
    Node<K, V> nextPtr;

    Node(K key, V value) {
        this.key = key;
        this.value = value;
        this.nextPtr = null;
    }
}

public class HashMap<K, V> {

    private int size;
    private Node[] list;
    private static int DEFAULT_SIZE = 16;

    public HashMap() {
        size = DEFAULT_SIZE;
        list = new Node[size];
    }

    public HashMap(int size) {
        this.size = size;
        list = new Node[size];
    }


    void put(K key, V value) {
        int hashValue = key.hashCode() % size;
        if (list[hashValue] == null) {
            list[hashValue] = new Node<>(key, value);
        } else {
            Node node = list[hashValue];
            while (node != null) {
                if (node.key == key) {
                    node.value = value;
                    break;
                }
                if (node.nextPtr == null) {
                    node.nextPtr = new Node(key, value);
                }
                node = node.nextPtr;
            }
        }
    }

    V get(K key) {
        int hashValue = key.hashCode() % size;
        if (list[hashValue] == null) {
            return null;
        } else {
            Node node = list[hashValue];
            while (node != null) {
                if (node.key == key) {
                    return (V) node.value;
                }
                node = node.nextPtr;
            }
            return null;
        }
    }

    static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        K getKey() {
            return key;
        }

        V getValue() {
            return value;
        }
    }
}
