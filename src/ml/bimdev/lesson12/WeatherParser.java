package ml.bimdev.lesson12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WeatherParser {
    public static void main(String[] args) throws FileNotFoundException {
        File wFile = new File("assets/lesson12/weather.txt");
        Scanner sc = new Scanner(wFile);

        while (sc.hasNextLine()) {
            sc.next();
            System.out.println(sc.nextInt());
        }


    }
}
