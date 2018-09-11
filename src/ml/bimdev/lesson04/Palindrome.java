package ml.bimdev.lesson04;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите слово: ");
        char[] word = sc.next().toCharArray();
        int len = word.length;
        boolean isPalindrome = true;

        for (int i = 0; i < len / 2; i++) {
            if (word[i] != word[len - i - 1]) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? "Это палиндром" : "Это не палиндром");
    }
}
