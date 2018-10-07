package ml.bimdev.lesson10;

import java.util.Scanner;

class MinNeighbourValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int k = Math.abs(arr[i] - arr[j]);
                if (k < min)
                    min = k;
            }
        }

        System.out.println(min);

    }
}
