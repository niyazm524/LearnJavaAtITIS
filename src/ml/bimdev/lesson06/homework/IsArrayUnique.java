package ml.bimdev.lesson06.homework;

public class IsArrayUnique {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 6, 8};
        int[] b = {1, 6, 7, 8, 0, 8};
        System.out.println(isArrayUnique(a)); // true
        System.out.println(isArrayUnique(b)); // false
    }

    private static boolean isArrayUnique(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j])
                    return false;
            }
        }
        return true;
    }
}
