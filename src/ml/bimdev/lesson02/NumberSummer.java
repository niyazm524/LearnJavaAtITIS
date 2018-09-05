package ml.bimdev.lesson02;

import java.util.Scanner;

public class NumberSummer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int mult = 1;
        int n = s.nextInt();
        for(int i = 0; i < n; i++)
            mult *= s.nextInt();

        System.out.println(mult);
    }
}
