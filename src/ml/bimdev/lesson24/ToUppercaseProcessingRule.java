package ml.bimdev.lesson24;

public class ToUppercaseProcessingRule implements TextProcessingRule {
    @Override
    public String process(String s) {
        return s.toUpperCase();
    }
}
