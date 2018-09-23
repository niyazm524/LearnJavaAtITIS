package ml.bimdev.lesson06.homework;

public class SetOperation {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int[] b = {2, 4, 6, 8, 10};
        int count = 0;

        for (int anA : a) {
            boolean isOnlyInA = true;
            for (int aB : b) {
                if (anA == aB) {
                    isOnlyInA = false;
                    break;
                }
            }
            if (isOnlyInA) {
                System.out.println(anA);
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
