package ml.bimdev.lesson24;

public class Main {
    public static void main(String[] args) {
        String[] s = {"abc - bca", "hello. How are you?", "TestString and trailing spaces   "};
        TextProcessingRule uppercaseProcessingRule = new ToUppercaseProcessingRule();
        TextProcessor textProcessor = new TextProcessor(s);
        textProcessor.process(uppercaseProcessingRule);

        textProcessor.process(new TextProcessingRule() {
            @Override
            public String process(String s) {
                return s.replaceAll("\\b-\\b", " - ");
            }
        });

        textProcessor.process(String::trim);

        textProcessor.process(s1 -> s1.replace(".", ""));

        textProcessor.show();
    }
}
