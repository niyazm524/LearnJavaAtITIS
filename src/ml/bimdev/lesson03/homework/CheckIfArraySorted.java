package ml.bimdev.lesson03.homework;

public class CheckIfArraySorted {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 4, 5, 6, 9, 9};
        boolean isSorted = true;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]) {
                isSorted = false;
                break;
            }
        }

        System.out.println("isSorted = " + isSorted);
    }
}
