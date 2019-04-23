package ml.bimdev.lesson38.classtest.task03;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CharacterProduct product = new CharacterProduct();
        Producer producer = new Producer("assets/lesson38/words.txt", product);
        Consumer consumer = new Consumer("assets/lesson38/task3.out", product);

        producer.start();
        consumer.start();
    }
}
