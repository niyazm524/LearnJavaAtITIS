package ml.bimdev.lesson08;

import java.util.Scanner;

public class Matrix {
    private int[][] m;

    Matrix(int[][] array) {
        this.m = array;
    }

    static Matrix generateSpiral(int n) {
        int[][] spiral = new int[n][n];
        int startI = 0, startJ = 0;
        int value = 0;

        for (int f = 0; f < n / 2; f++) {

            for (int j = startJ; j < n - startJ; j++)
                spiral[startI][j] = ++value;

            for (int i = startI + 1; i < n - startI; i++)
                spiral[i][n - startJ - 1] = ++value;

            for (int j = n - startJ * 2 - 1; j > startJ - 1; j--)
                spiral[n - startI - 1][j] = ++value;

            for (int i = n - startI * 2 - 1; i > startI; i--)
                spiral[i][startJ] = ++value;

            startI++;
            startJ++;
        }

        return new Matrix(spiral);

    }

    public boolean isMagic() {
        int n = m.length;
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += m[i][i];
        }
        for (int i = 0; i < n; i++) {
            sum2 += m[i][n - i - 1];
        }
        if (sum1 != sum2) return false;
        for (int i = 0; i < n; i++) {
            int sum3 = 0, sum4 = 0;
            for (int j = 0; j < n; j++) {
                sum3 += m[i][j];
                sum4 += m[j][i];
            }
            if (sum2 != sum3 || sum2 != sum4)
                return false;
        }
        return true;

    }

    public void printMatriceVectors() {
        int maxSumK = Integer.MIN_VALUE, maxSumL = Integer.MIN_VALUE;
        int kIndex = 0, lIndex = 0;
        for (int i = 0; i < m.length; i++) {
            int sumK = 0, sumL = 0;
            for (int j = 0; j < m[0].length; j++) {
                sumK += m[i][j];
                sumL += m[j][i];
            }
            if (sumK > maxSumK) {
                maxSumK = sumK;
                kIndex = i;
            }
            if (sumL > maxSumL) {
                maxSumL = sumL;
                lIndex = i;
            }
        }
        for (int i = 0; i < m[0].length; i++) {
            System.out.printf("%s ", m[lIndex][i]);
        }
        System.out.println();
        for (int i = 0; i < m[0].length; i++) {
            System.out.printf("%s ", m[i][kIndex]);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] aM : m) {
            for (int j = 0; j < aM.length; j++) {
                if (Integer.toString(aM[j]).length() == 1)
                    sb.append(' ');
                sb.append(aM[j]);
                sb.append(' ');
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    static Matrix fromKeyboard(Scanner sc, int size) {
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("matrix[%s][%s] = ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }
        return new Matrix(matrix);
    }
}