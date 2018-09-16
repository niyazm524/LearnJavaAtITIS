package ml.bimdev.lesson03.homework;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {12, 7, 1, 98, 86};
        int[] reversedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - i - 1];
            System.out.print(reversedArray[i] + " ");
        }
    }
}
