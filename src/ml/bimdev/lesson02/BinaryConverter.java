package ml.bimdev.lesson02;

import java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args) {
        String result = "";
        System.out.println("Введите число ");
        int num = (new Scanner(System.in)).nextInt();

        while (num > 0) {
            int d = num % 2;
            result = d + result;
            num /= 2;

        }
        System.out.println(result);
    }
}
