package ml.bimdev.lesson21.queue;

public interface Queue<T> {
    public void enqueue(T value);

    public T dequeue();

    public boolean isEmpty();

    public int size();
}
