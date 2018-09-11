package ml.bimdev.lesson03;

import java.util.Scanner;

public class PrintBackwards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Количество элементов: ");
        int len = sc.nextInt();
        int[] arr = new int[len];

        for(int i = 0; i < len; i++)
            arr[i] = sc.nextInt();

        for(int i = len - 1; i >= 0; i--)
            System.out.println(arr[i]);

    }
}
