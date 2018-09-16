package ml.bimdev.lesson04.homework;

import java.util.Scanner;

public class CharShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        char[] str = sc.next().toCharArray();
        System.out.print("Shift: ");
        int shift = str.length - (sc.nextInt() % str.length);

        for (int i = shift; i < str.length + shift; i++) {
            System.out.print(str[i % str.length]);
        }
    }
}
