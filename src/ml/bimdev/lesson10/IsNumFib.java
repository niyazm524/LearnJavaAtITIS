package ml.bimdev.lesson10;

import java.util.Scanner;

class IsNumFib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int i = 1, prev1 = 0, prev2 = 0;
        while (prev1 < num || prev2 < num) {
            if (i == num) {
                System.out.println("It's fib");
                return;
            }
            prev2 = prev1;
            prev1 = i;
            i = prev1 + prev2;
        }
        System.out.println("It's not fib");
    }
}
