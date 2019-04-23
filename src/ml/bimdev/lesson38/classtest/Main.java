package ml.bimdev.lesson38.classtest;

import ml.bimdev.lesson38.classtest.task01.TextAnalyzer;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        TextAnalyzer analyzer = new TextAnalyzer("assets/lesson38/words.txt");
        analyzer.analyze(str -> (str.length() > 0 && Character.isUpperCase(str.charAt(0))))
                .forEach(System.out::println);

    }
}
