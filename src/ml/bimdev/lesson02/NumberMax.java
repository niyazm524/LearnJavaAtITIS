package ml.bimdev.lesson02;

import java.util.Scanner;

public class NumberMax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int n = s.nextInt();
        for(int i = 0; i < n; i++) {
            int q = s.nextInt();
            if (q > max) {
                max2 = max;
                max = q;
            }
            else {
                if (q > max2) max2 = q;
            }
        }
        System.out.println(max);
        System.out.println(max2);
    }
}
