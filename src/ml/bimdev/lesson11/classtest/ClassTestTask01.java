package ml.bimdev.lesson11.classtest;

/*
        Variant 2
*/


import java.util.Arrays;
import java.util.Scanner;

class ClassTestTask01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n * n];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%s] = ", i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Sorted: ");
        sortArr(arr);

        System.out.println(Arrays.toString(arr));

        int[][] matrix = generateSpiral(arr);
        prettyPrintMatrix(matrix);
        System.out.println();

        System.out.printf("Sum under main diagonal: %s\n", sumUnderDiagonal(matrix));
    }

    static void sortArr(int[] array) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < array.length; i++) {
                if (sumOfDigits(array[i - 1]) > sumOfDigits(array[i])) {
                    int t = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = t;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    private static int sumOfDigits(int n) {
        if (n < 0) n = -n;
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static int[][] generateSpiral(int[] source) {
        int n = (int) Math.sqrt(source.length);
        int[][] matrix = new int[n][n];
        int count = 0;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - 1 - i; j++) {
                matrix[i][j] = source[count++];
            }
            for (int j = i; j < n - 1 - i; j++) {
                matrix[j][n - 1 - i] = source[count++];
            }
            for (int j = n - 1 - i; j > i; j--) {
                matrix[n - 1 - i][j] = source[count++];
            }
            for (int j = n - 1 - i; j > i; j--) {
                matrix[j][i] = source[count++];
            }
        }
        if (n % 2 == 1) {
            matrix[n / 2][n / 2] = source[count];
        }

        return matrix;
    }

    static void prettyPrintMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int sumUnderDiagonal(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}
