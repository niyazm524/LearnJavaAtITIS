package ml.bimdev.lesson31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BruteTask {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateCombinationsRecursion("abc".toCharArray(), )));
    }

    String[] generateCombinationsLoop(String input) {
        char[] chars = input.toCharArray();
        for(int i = 0; i < chars.length; i++) {

        }
        return null;
    }

    /*
    abc
    acb
    bac
    bca
    cab
    cba

     */

    private static String[] generateCombinationsRecursion(String input) {
        if(input.length() == 1) return new String[] {input};
        char first = input.charAt(0);
        String[] variants = new String[fact(input.length())];


    }

    private static int fact(int n) {
        return n == 1 ? 1 : n * fact(n - 1);
    }


}
