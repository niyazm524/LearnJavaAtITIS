package ml.bimdev.lesson22;

import java.util.Arrays;
import java.util.Random;

public class StringHashCodeCollision {
    private static Random rnd = new Random();

    public static void main(String[] args) {
        int[] arr = new int[16];
        for (int i = 0; i < 10000; i++) {
            arr[Math.abs(getRandomString().hashCode()) % arr.length]++;
        }
        System.out.println(Arrays.toString(arr));
    }

    static String getRandomString() {
        int len = rnd.nextInt(8) + 7;
        char[] chars = new char[len];
        for (int i = 0; i < len; i++) {
            chars[i] = (char) (rnd.nextInt('z' - 'A') + 'A');
        }
        return String.valueOf(chars);
    }
}
