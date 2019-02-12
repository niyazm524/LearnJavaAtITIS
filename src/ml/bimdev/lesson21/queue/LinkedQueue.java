package ml.bimdev.lesson21.queue;

public class LinkedQueue<T> implements Queue<T> {
    private Node head, tail;

    @Override
    public void enqueue(T value) {
        if (tail == null) {
            head = tail = new Node(value);
        } else {
            Node oldTail = tail;
            tail = new Node(tail, value);
            oldTail.next = tail;
        }
    }

    @Override
    public T dequeue() {
        if (head == null) return null;
        T value = head.value;
        head = head.next;
        return value;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size() {
        int size = 0;
        Node current = head;
        while (current != null) {
            current = current.next;
            size++;
        }
        return size;
    }

    private class Node {
        Node previous, next;
        T value;

        Node(T value) {
            this.value = value;
        }

        Node(Node previous, T value) {
            this.previous = previous;
            this.value = value;
        }
    }
}
