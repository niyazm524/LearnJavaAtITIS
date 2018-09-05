package ml.bimdev.lesson02;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        while(num > 0)  {
            int digit = num % 10;
            result = result*10 + digit;
            num = num / 10;
        }

        System.out.println(result);
    }
}
