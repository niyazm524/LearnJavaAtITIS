package ml.bimdev.lesson25;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

class Main {
    static int[] randomArray = new int[10000000];

    static {
        Random rnd = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = rnd.nextInt();
        }
    }

    public static void main(String[] args) {
        measureSorting(Sorter::mergeSort);
    }

    static void measureSorting(Sorting sorting) {
        int[] arr = new int[randomArray.length];
        System.arraycopy(randomArray, 0, arr, 0, randomArray.length);
        long start = System.currentTimeMillis();
        sorting.sort(arr);
        long millis = System.currentTimeMillis() - start;
        System.out.println("Сортировка заняла " + millis + " мсек");
    }
}

interface Sorting {
    void sort(int[] arr);
}