package ml.bimdev.lesson05.homework;

import java.util.Scanner;

public class HideDigitsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.nextLine().toCharArray();

        for (int i = 0; i < input.length; i++) {
            if (input[i] >= '0' && input[i] <= '9')
                input[i] = '*';
        }

        System.out.println(String.valueOf(input));
    }
}
