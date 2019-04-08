package ml.bimdev.lesson33;

import java.util.Arrays;

public class QueenPos {
    private static int count = 0;
    private static int[] y = new int[8];

    public static void main(String[] args) {
        putQueen(0);
        System.out.println(count);
    }

    private static void putQueen(int x) {
        if (x == 8) count++;
        else {
            for (y[x] = 0; y[x] < 8; y[x]++) {
                if (isCorrect(x))
                    putQueen(x + 1);
            }
        }
    }

    private static boolean isCorrect(int x) {
        for (int x1 = 0; x1 < x; x1++) {
            if (y[x1] == y[x] || Math.abs(x - x1) == Math.abs(y[x] - y[x1]))
                return false;
        }
        return true;
    }
}
