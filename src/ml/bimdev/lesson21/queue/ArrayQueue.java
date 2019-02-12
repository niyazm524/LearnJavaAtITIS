package ml.bimdev.lesson21.queue;

public class ArrayQueue<T> implements Queue<T> {
    private Object[] buffer;
    private int index = 0;
    private int size = 0;

    public ArrayQueue(int capacity) {
        this.buffer = new Object[capacity];
    }

    @Override
    public void enqueue(T value) {
        if (this.size++ == buffer.length) throw new IllegalStateException("Queue is full.");
        this.buffer[index++] = value;

        index %= buffer.length;
    }

    @Override
    public T dequeue() {
        int i = index - size >= 0 ? index - size : buffer.length + index - size;
        size--;
        return (T) buffer[i];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }
}
