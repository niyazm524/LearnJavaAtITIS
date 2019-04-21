package ml.bimdev.lesson36.homework;

import java.util.Arrays;
import java.util.Random;

class ThreadWorkers {
    public static int mainSum = 0;
    private static int N = 5;
    private static Random rnd = new Random();

    public static void main(String[] args) throws InterruptedException {
        int[] numbers = new int[1000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt(100);
        }
        CounterThread[] threads = new CounterThread[N];
        for (int i = 0; i < N; i++) {
            threads[i] = new CounterThread(numbers, i * (1000 / N), (i + 1) * (1000 / N));
            threads[i].start();
        }

        for (CounterThread thread : threads) thread.join();

        System.out.println("Сумма " + (checkSum(numbers) ? "совпадает" : "не совпадает"));
    }

    private static boolean checkSum(int[] numbers) {
        return Arrays.stream(numbers).sum() == mainSum;
    }

}
