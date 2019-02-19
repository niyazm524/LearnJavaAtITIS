package ml.bimdev.lesson23;

public class TextProcessor {
    private String[] strings;

    public TextProcessor(String[] strings) {
        this.strings = strings;
    }

    void process(TextProcessingRule rule) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = rule.process(strings[i]);
        }
    }

    void show() {
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
