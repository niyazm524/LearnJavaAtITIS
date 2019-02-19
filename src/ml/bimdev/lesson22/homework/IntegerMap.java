package ml.bimdev.lesson22.homework;

import ml.bimdev.lesson21.map.SimpleMap;

import java.util.Arrays;
import java.util.stream.Stream;

class IntegerMap extends SimpleMap<String, Integer> {
    public void add(String key, int value) {
        for (int i = 0; i < count; i++) {
            if (entries[i].key.equals(key)) {
                entries[i].value += value;
                return;
            }
        }
        if (count >= entries.length) grow();
        entries[count++] = new Entry(key, value);
    }

    public void sortByValue() {
        Arrays.sort(entries, (o1, o2) -> {
            if (o2 == null) return -1;
            if (o1 == null) return 1;
            return o2.value - o1.value;
        });
    }

    public Stream asStream() {
        return Arrays.stream(entries, 0, count);
    }

    public static class Entry extends SimpleMap.Entry<String, Integer> {
        public Entry(String key, Integer value) {
            super(key, value);
        }

        public String toString() {
            return String.format("%s: %s", key, value);
        }
    }

}
