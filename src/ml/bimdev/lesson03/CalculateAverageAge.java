package ml.bimdev.lesson03;

import java.util.Scanner;

public class CalculateAverageAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Количество студентов: ");
        int len = sc.nextInt();

        int sum = 0;
        int[] arr = new int[len];

        for(int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int averageAge = sum / len;
        System.out.printf("Средний возраст: %s\n\n", averageAge);

        for(int age : arr)
            if(age >= averageAge)
                System.out.println(age);

    }
}
