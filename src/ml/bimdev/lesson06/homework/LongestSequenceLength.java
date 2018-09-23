package ml.bimdev.lesson06.homework;

import java.util.Scanner;

public class LongestSequenceLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int seqLength = 1, maxSeqLength = 0;
        int prevSeqElem = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == prevSeqElem) {
                seqLength++;
            } else {
                prevSeqElem = array[i];
                maxSeqLength = Math.max(seqLength, maxSeqLength);
                seqLength = 1;
            }
        }
        maxSeqLength = Math.max(seqLength, maxSeqLength);

        System.out.println(maxSeqLength);
    }
}
