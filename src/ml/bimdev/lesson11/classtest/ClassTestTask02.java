package ml.bimdev.lesson11.classtest;

/*
        Variant 2
*/

import java.util.Scanner;

class ClassTestTask02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter line of digits: ");
        char[] digits = sc.next().toCharArray();
        System.out.println(isPalindrome(digits, 0));
    }

    private static boolean isPalindrome(char[] chars, int curI) {
        if (chars[curI] == chars[chars.length - curI - 1]) {
            if (curI * 2 < chars.length) {
                return isPalindrome(chars, curI + 1);
            } else
                return true;
        } else
            return false;

    }
}
