package ml.bimdev.lesson03.homework;

public class JoinArrayElements {
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 11, 133};
        long joinedInts = 0;

        for (int i = 0, tempE, shift; i < arr.length; i++) {
            tempE = arr[i];
            shift = 1;
            do {
                shift *= 10;
                tempE /= 10;
            } while (tempE > 0);
            joinedInts = joinedInts * shift + arr[i];
        }

        System.out.println("joinedIntegers = " + joinedInts);
    }
}
