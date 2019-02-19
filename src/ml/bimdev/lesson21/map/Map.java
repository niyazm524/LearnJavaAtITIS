package ml.bimdev.lesson21.map;

public interface Map<K, V> {
    V get(K key);

    void put(K key, V value);

    boolean isEmpty();

    int size();
}
