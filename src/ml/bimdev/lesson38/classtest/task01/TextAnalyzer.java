package ml.bimdev.lesson38.classtest.task01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TextAnalyzer {
    String[] words;
    Map<String, Integer> wordsMap = new HashMap<>();

    public TextAnalyzer(String filename) throws IOException {
        words = Files
                .readAllLines(Paths.get(filename))
                .stream()
                .flatMap(str -> Arrays.stream(str.split("[\\s\\n\\t.,]+")))
                .toArray(String[]::new);
    }

    public List<String> analyze(Predicate<String> predicate) {
        Arrays.stream(words)
                .filter(predicate)
                .forEach(word -> wordsMap.merge(word, 1, Integer::sum));
        return wordsMap
                .entrySet()
                .stream()
                .sorted((x, y) -> Integer.compare(y.getValue(), x.getValue()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
