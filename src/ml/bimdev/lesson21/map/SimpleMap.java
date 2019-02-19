package ml.bimdev.lesson21.map;

public class SimpleMap<K, V> implements Map<K, V> {
    protected Entry<K, V>[] entries;
    protected int count;

    public SimpleMap(int size) {
        this.entries = new Entry[size];
    }

    public SimpleMap() {
        this(15);
    }

    @Override
    public V get(K key) {
        for (int i = 0; i < count; i++) {
            if (entries[i].key.equals(key)) {
                return entries[i].value;
            }
        }
        return null;
    }

    @Override
    public void put(K key, V value) {
        for (int i = 0; i < count; i++) {
            if (entries[i].key.equals(key)) {
                entries[i].value = value;
                return;
            }
        }
        if (count >= entries.length) grow();
        entries[count++] = new Entry<>(key, value);
    }

    protected void grow() {
        int oldCapacity = entries.length;
        float EXTENSION_COEF = 1.5f;
        int newCapacity = (int) (oldCapacity * EXTENSION_COEF);
        Entry<K, V>[] newElements = new Entry[newCapacity];
        System.arraycopy(entries, 0, newElements, 0, entries.length);
        entries = newElements;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "Empty SimpleMap";
        StringBuilder sb = new StringBuilder("SimpleMap {\n");
        for (int i = 0; i < count; i++) {
            Entry<K, V> entry = entries[i];
            sb.append('\t').append(entry.key.toString()).append(": ").append(entry.value.toString()).append('\n');
        }
        return sb.append('}').toString();
    }

    public static class Entry<A, B> {
        public A key;
        public B value;

        public Entry(A key, B value) {
            this.key = key;
            this.value = value;
        }
    }
}
