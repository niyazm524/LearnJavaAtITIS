package ml.bimdev.lesson20;

class Stack {
    private char[] elements;
    private int n;

    Stack(int capacity) {
        elements = new char[capacity];
        n = 0;
    }

    void push(char c) {
        if (n >= elements.length)
            throw new IllegalStateException("Stack is already full");
        elements[n++] = c;
    }

    char pop() {
        if (n <= 0)
            throw new IllegalStateException("Stack is empty");
        return elements[--n];
    }

    boolean isEmpty() {
        return n == 0;
    }
}
