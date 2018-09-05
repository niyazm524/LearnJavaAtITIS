package ml.bimdev.lesson02;

import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int r = N;
        while (K > 1) {
            r = r * N;
            K = K - 1;
        }
        System.out.println(r);
    }
}
