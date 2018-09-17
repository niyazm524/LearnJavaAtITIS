package ml.bimdev.lesson05;

import java.util.Scanner;

public class SimpleCalculator {

    private static double calculate(double num1, double num2, String op) {
        switch (op) {
            case "+":
                return (num1 + num2);
            case "-":
                return (num1 - num2);
            case "*":
                return (num1 * num2);
            case "/":
                return (num1 / num2);
            default:
                System.out.println("Неподдерживаемая операция!");
                return 0.0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = sc.nextDouble();
        double num2;
        do {

            System.out.print("Введите оператор: ");
            String op = sc.next();
            System.out.print("Введите второе число: ");
            num2 = sc.nextDouble();
            double result = calculate(num1, num2, op);
            System.out.printf("Ответ: %s\n", result);
            System.out.print("Сбросить результат? [y/n] ");
            boolean reset = !sc.next().equals("y");
            if (reset) {
                num1 = result;
            } else {
                System.out.print("Завершить? [y/n]  ");
                String term = sc.next();
                if (term.equals("y"))
                    break;
                System.out.print("Введите первое число: ");
                num1 = sc.nextDouble();
            }
        } while (true);
    }
}
