package ml.bimdev.lesson03.homework;

import java.util.Random;

public class MaxAbsElement {
    public static void main(String[] args) {
        final int SIZE = 20;
        int[] arr = new int[SIZE];
        Random random = new Random();

        // Generate almost random array
        for (int i = 0; i < SIZE; i++) {
            arr[i] = random.nextInt(1000) - 600;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int maxAbs = 0, maxAbsIndex = -1;
        for (int i = 0; i < SIZE; i++) {
            if (Math.abs(arr[i]) > maxAbs) {
                maxAbs = Math.abs(arr[i]);
                maxAbsIndex = i;
            }
        }

        System.out.println("maxAbs = " + maxAbs);
        System.out.println("maxAbsIndex = " + maxAbsIndex);
    }
}
