package ml.bimdev.lesson24.homework;

import java.util.Iterator;

public class SortedLinkedList<T> implements Iterable<T> {
    private Node<T> head;
    private int count = 0;

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (head != null) {
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        } else {
            head = newNode;
        }
        count++;
    }

    public T get(int index) {
        if (index < 0 || index >= count)
            throw new IndexOutOfBoundsException("Index: " + index);
        else {
            Node<T> elem = head;
            for (int i = 0; i < index; i++) {
                elem = elem.getNext();
            }
            return (T) elem.getValue();
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= count)
            throw new IndexOutOfBoundsException("Index: " + index);
        else if (index == 0) {
            head = head.getNext();
        } else {
            Node<T> beforeElem = head;
            for (int i = 0; i < index - 1; i++) {
                beforeElem = beforeElem.getNext();
            }
            beforeElem.setNext(beforeElem.getNext().getNext());
        }
        count--;
    }

    public boolean contains(T value) {
        Node<T> current = head;
        while (current.hasNext()) {
            if (current.getValue() == value)
                return true;
            current = current.getNext();
        }
        return false;
    }

    public Object[] toArray() {
        Object[] arr = new Object[count];
        Node<T> node = head;
        for (int i = 0; i < count; i++) {
            arr[i] = node.getValue();
            node = node.getNext();
        }
        return arr;
    }

    private Node<T> getTail() {
        if (head == null) return null;
        Node<T> node = head;
        while (node.hasNext()) {
            node = node.getNext();
        }
        return node;
    }

    public void addAll(SortedLinkedList<T> list) {
        if (list.size() == 0) return;
        Node<T> tail = getTail();
        if (tail == null) {
            tail = new Node<>(list.get(0));
            head = tail;
            if (list.size() > 1) {
                Iterator<T> iterator = list.iterator();
                iterator.next();
                for (T t : list) {
                    tail.setNext(tail = new Node<>(t));
                }
            }
        } else {
            Node<T> n = tail;
            for (T k : list) {
                n.setNext(n = new Node<>(k));
            }
        }

    }

    public int size() {
        return count;
    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> iterator = new Iterator<T>() {
            Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current.hasNext();
            }

            @Override
            public T next() {
                current = current.getNext();
                return current.getValue();
            }
        };
        return iterator;
    }


    class Node<E> {
        private Node<E> next;
        private E value;

        Node(E value) {
            this.value = value;
        }

        void setNext(Node<E> next) {
            this.next = next;
        }

        Node<E> getNext() {
            return next;
        }

        E getValue() {
            return value;
        }

        boolean hasNext() {
            return next != null;
        }
    }

}
