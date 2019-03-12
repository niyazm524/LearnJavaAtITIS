package ml.bimdev.lesson21.binsearch;

public class Main {
    public static void main(String[] args) {
        SortedList<AudioTrack> list = new SortedList<>();
        for (int i = 0; i < 3; i++) {
            list.add(AudioTrack.random());
            list.printList();
            System.out.println();
        }
    }
}
