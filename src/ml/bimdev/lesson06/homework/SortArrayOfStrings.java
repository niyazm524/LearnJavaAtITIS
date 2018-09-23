package ml.bimdev.lesson06.homework;

import java.util.Arrays;
import java.util.Random;

public class SortArrayOfStrings {

    private static String[] getRandomStringArray(int size, int minStrLength, int maxStrLength) {
        Random rnd = new Random();
        String[] array = new String[size];

        for (int i = 0; i < array.length; i++) {
            char[] str = new char[rnd.nextInt(maxStrLength - minStrLength) + minStrLength];
            for (int j = 0; j < str.length; j++) {
                str[j] = (char) (rnd.nextInt(24) + 65);
            }
            array[i] = String.valueOf(str);
        }
        return array;
    }

    private static void sortByLength(String[] array) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1].length() > array[i].length()) {
                    String t = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = t;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void main(String[] args) {
        String[] array = getRandomStringArray(10, 5, 20);
        System.out.println(Arrays.toString(array));
        sortByLength(array);
        System.out.println(Arrays.toString(array));
    }
}
