package ml.bimdev.lesson05.homework;

import java.util.Scanner;

public class ParseIntFromStdin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numS = sc.next();
        char[] numC = numS.toCharArray();
        int numI = 0;
        int multiplier = 1;

        for (int i = numC.length - 1; i >= 0; i--) {
            if (numC[i] >= '0' && numC[i] <= '9') {
                numI += (numC[i] - '0') * multiplier;
                multiplier *= 10;
            } else {
                System.err.printf("Your string contains non-digit chars!\n" +
                        "Parsed: %s\n" +
                        "Error index: %s", numI, i);
                return;
            }
        }

        System.out.println(numI);
    }
}
