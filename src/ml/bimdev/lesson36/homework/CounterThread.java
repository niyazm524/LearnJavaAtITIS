package ml.bimdev.lesson36.homework;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//считает сумму элементов в некотором диапазоне
//из массива
class CounterThread extends Thread {
    private int[] arr;
    private int start;
    private int end;

    private static final Object MUTEX = new Object();
    private static Lock lock = new ReentrantLock();

    CounterThread(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            // synchronized (MUTEX) {
            lock.lock();
            ThreadWorkers.mainSum = ThreadWorkers.mainSum + arr[i];
            lock.unlock();
            // }
        }
    }
}