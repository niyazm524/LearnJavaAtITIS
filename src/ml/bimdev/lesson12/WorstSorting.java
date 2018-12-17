package ml.bimdev.lesson12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WorstSorting {
    static String inputFilePath = "assets/lesson12/WorstSorting/input.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(inputFilePath));


    }

    static void sortToFiles(int k) throws IOException {
        PrintWriter[] printWriters = new PrintWriter[10];
        for (int i = 0; i < printWriters.length; i++) {
            printWriters[i] = new PrintWriter(new File("assets/lesson12/WorstSorting/Sorted_" + i));
        }
        Scanner sc = new Scanner(new File(inputFilePath));
        while (sc.hasNextInt()) {
            int x = sc.nextInt();

        }
    }

    static void merge() throws IOException {
        PrintWriter pw = new PrintWriter(new File(inputFilePath));
        Scanner[] scanners = new Scanner[10];
        for (int i = 0; i < scanners.length; i++) {
            scanners[i] = new Scanner(new File("assets/lesson12/WorstSorting/Sorted_" + i));
        }
    }

    static int maxLength(Scanner sc) {
        int max = 0;
        while (sc.hasNextInt()) {
            int x = (int) Math.log10(sc.nextInt()) + 1;
            if (x > max) max = x;
        }
        return max;
    }
}
