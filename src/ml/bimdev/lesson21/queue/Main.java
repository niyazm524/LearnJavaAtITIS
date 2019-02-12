package ml.bimdev.lesson21.queue;

public class Main {
    public static void main(String[] args) {
        Queue<Character> queue = new ArrayQueue<>(2);
        queue.enqueue('a');
        queue.enqueue('b');
        System.out.println(queue.dequeue());
        queue.enqueue('c');
        System.out.println("queue.size() = " + queue.size());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
