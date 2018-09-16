package ml.bimdev.lesson03.homework;

import java.util.Scanner;

public class FindLocalMaximumCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Count of integers: ");
        int N = sc.nextInt();
        int localMaximumCount = 0;
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = sc.nextInt();
        }

        for (int i = 1; i < N - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                localMaximumCount++;
            }
        }

        System.out.println("localMaximumCount = " + localMaximumCount);
    }
}
