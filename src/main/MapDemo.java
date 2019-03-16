package main;

public class MapDemo<K, V> {
    Entry<K, V>[] array;
    int size;

    public MapDemo() {
        this(9);
    }

    public MapDemo(int initLength) {
        array = new Entry[initLength];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean put(K key, V value) {
        for (int i = 0; i < size; i++) {
            if ((array[i].key).equals(key)) {
                array[i].value = value;
                return true;
            }
        }
        array[size] = new Entry<>(key, value);
        size++;
        return true;
    }

    public V get(Object key) {
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                if ((array[i].key).equals(key)) {
                    return array[i].value;
                }
            }
        }
        return null;
    }

    public boolean containsValue(V value) {
        for (int i = 0; i < size; i++) {
            if ((array[i].value).equals(value)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return this.size;
    }

    public boolean replace(K key, V oldValue, V newValue) {
        for (int i = 0; i < size; i++) {
            if ((array[i].key).equals(key)) {
                array[i].value = newValue;
                return true;
            }
        }
        return false;
    }
}
