package ml.bimdev.lesson04.homework;

import java.util.Scanner;

public class DeleteSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        char[] str = sc.next().toCharArray();
        System.out.print("Delete from: ");
        int from = sc.nextInt();
        System.out.print("To: ");
        int to = sc.nextInt();

        char[] result = new char[str.length - to + from - 1];

        for (int i = 0, j = 0; i < str.length; i++) {
            if (i < from || i > to) {
                result[j] = str[i];
                j++;
            }
        }

        String strResult = String.valueOf(result);

        System.out.println("strResult = " + strResult);
    }
}
