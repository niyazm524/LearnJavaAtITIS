package ml.bimdev.lesson12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIntsSum {
    public static void main(String[] args) throws FileNotFoundException {
        File f1 = new File("assets/lesson12/in1.txt");
        Scanner sc1 = new Scanner(f1);
        File f2 = new File("assets/lesson12/in2.txt");
        Scanner sc2 = new Scanner(f2);

        File out = new File("assets/lesson12/FileIntsSum.out");
        PrintWriter pw = new PrintWriter(out);

        int a = 0, b = 0;
        while (sc1.hasNext() && sc2.hasNext()) {
            a = sc1.nextInt();
            b = sc2.nextInt();
            pw.println(a + b);

        }
        pw.close();
    }
}
