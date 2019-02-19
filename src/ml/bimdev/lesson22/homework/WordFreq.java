package ml.bimdev.lesson22.homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

class WordFreq {
    private IntegerMap map;

    public static void main(String[] args) throws IOException {
        WordFreq wordFreq = new WordFreq();
        wordFreq.pushFile("assets/lesson22/java-tutorial.txt");
        System.out.println(wordFreq.formatResults());
    }

    WordFreq() {
        map = new IntegerMap();
    }

    public void pushString(String s) {
        pushArray(tokenize(s));
    }

    public void pushArray(String[] words) {
        for (String word : words) {
            map.add(word, 1);
        }
    }

    public void pushFile(String filename) throws IOException {
        File file = new File(filename);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        bufferedReader.lines().map(this::tokenize).forEach(this::pushArray);
    }

    public Stream getResultsAsStream() {
        map.sortByValue();
        return map.asStream();
    }

    public String formatResults() {
        map.sortByValue();
        return map.toString();
    }

    private String[] tokenize(String text) {
        return text.toLowerCase().split("[\\s\\t\\n.!?,;:()]+");
    }
}
