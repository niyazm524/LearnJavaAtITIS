package ml.bimdev.lesson21.binsearch;

public class SortedList<T extends Comparable> {
    private Object[] arr;
    private int count;

    public SortedList() {
        this.arr = new Object[10];
    }

    private void grow() {
        int oldCapacity = arr.length;
        int newCapacity = (int) (oldCapacity * 1.5f);
        Object[] newArr = new Object[newCapacity];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
    }

    public void add(T element) {
        if (count >= arr.length)
            grow();
        int c = 0;
        while (c < count && ((T) arr[c]).compareTo(element) <= 0) {
            c++;
        }
        if (count - 1 - c >= 0) System.arraycopy(arr, c + 1, arr, c + 1 + 1, count - 1 - c);
        count++;
        arr[c] = element;
    }

    public void printList() {
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i] == null ? null : (arr[i]).toString());
        }
    }
}
