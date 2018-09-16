package ml.bimdev.lesson04.homework;

public class FindArrayOccurrence {
    public static void main(String[] args) {
        int[] bigArray = {1, 2, 3, 4, 2, 3, 4};
        int[] smallArray = {2, 3, 4};
        int occurrenceIndex = -1;

        for (int i = 0; i < bigArray.length; i++) {
            boolean isOccurence = true;
            for (int j = 0; j < smallArray.length; j++) {
                if (smallArray[j] != bigArray[i + j]) {
                    isOccurence = false;
                    break;
                }
            }

            if (isOccurence) {
                occurrenceIndex = i;
                break;
            }
        }

        System.out.println("occurrenceIndex = " + occurrenceIndex);
    }
}
