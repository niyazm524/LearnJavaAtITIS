package ml.bimdev.lesson23;

public class ToUppercaseProcessingRule implements TextProcessingRule {
    @Override
    public String process(String s) {
        return s.toUpperCase();
    }
}
