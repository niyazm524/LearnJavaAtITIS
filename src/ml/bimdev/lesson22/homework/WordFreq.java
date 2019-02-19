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
        wordFreq.getTopResults(10).forEach(System.out::println);
    }

    public WordFreq() {
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

    public Stream<IntegerMap.Entry> getResultsAsStream() {
        map.sortByValue();
        return map.asStream();
    }

    public Stream<IntegerMap.Entry> getTopResults(int limit) {
        return getResultsAsStream().limit(limit);
    }

    @Override
    public String toString() {
        map.sortByValue();
        return map.toString();
    }

    private String[] tokenize(String text) {
        return text.toLowerCase().split("[\\s\\t\\n.!?,;:()]+");
    }
}
