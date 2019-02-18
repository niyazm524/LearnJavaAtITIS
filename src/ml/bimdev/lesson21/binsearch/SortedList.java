package ml.bimdev.lesson21.binsearch;

import java.util.Comparator;

public class SortedList<T extends Comparable> {
    private Object[] arr;
    private int count;

    public SortedList(int size) {
        this.arr = new Object[size];
    }

    public void add(T audioTrack) {
        if (count >= arr.length)
            throw new IllegalStateException("List is full");
        int c = 0;
        while (c < count && ((T) arr[c]).compareTo(audioTrack) <= 0) {
            c++;
        }
        for (int i = count - 1; i > c; i--) {
            arr[i + 1] = arr[i];
        }
        count++;
        arr[c] = audioTrack;
    }

    public void printList() {
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i] == null ? null : (arr[i]).toString());
        }
    }
}
