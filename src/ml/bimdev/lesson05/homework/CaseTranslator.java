package ml.bimdev.lesson05.homework;

import java.util.Scanner;

public class CaseTranslator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        char[] str = sc.nextLine().toCharArray();
        System.out.print("Select case [U|l]: ");
        boolean isUpper = !sc.next().equals("l");

        char leftBorder = isUpper ? 'a' : 'A';
        char rightBorder = isUpper ? 'z' : 'Z';

        for (int i = 0; i < str.length; i++) {
            if (str[i] >= leftBorder && str[i] <= rightBorder)
                str[i] += isUpper ? -32 : 32;
        }

        System.out.println(str);
    }
}
