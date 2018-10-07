package ml.bimdev.lesson07;

public class HabrTasks {
    public static void main(String[] args) {
        System.out.println("taskA(5) = " + taskA(5));
        System.out.println("taskD(32) = " + taskD(32));
        System.out.println("taskE(1245) = " + taskE(1245));
        System.out.print("taskF(12345) = ");
        taskF(12345);
        System.out.println();
        System.out.print("taskG(12345) = ");
        taskG(12345);
        System.out.println();
    }

    private static int taskA(int n) {
        if (n == 1)
            return 1;
        else {
            System.out.println(taskA(n - 1));
            return n;
        }
    }

    private static boolean taskD(int n) {
        if (n <= 2) {
            return n % 2 == 0;
        } else {
            if (n % 2 == 0)
                return taskD(n / 2);
            else
                return false;
        }
    }

    private static int taskE(int n) {
        if (n == 0) {
            return 0;
        } else {
            return taskE(n / 10) + n % 10;
        }
    }

    private static void taskF(int n) {
        if (n > 0) {
            System.out.print(n % 10 + " ");
            taskF(n / 10);
        }
    }

    private static void taskG(int n) {
        if (n > 0) {
            taskG(n / 10);
            System.out.print(n % 10 + " ");
        }
    }


}
