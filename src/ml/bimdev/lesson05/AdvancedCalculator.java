package ml.bimdev.lesson05;

import java.util.*;

public class AdvancedCalculator {
    private static final Set<Character> delimiters = new HashSet<>(Arrays.asList(
            '(', ')', '+', '-', '/', '*'
    ));

//    public static String parse(String expr) {
//
//    }

    private static String[] tokenize(String str) {
        ArrayList<String> tokens = new ArrayList<>();
        char[] arr = str.toCharArray();
        for (int i = 0, start = -1; i < arr.length; i++) {
            if (delimiters.contains(arr[i])) {
                if (start != -1) {
                    tokens.add(String.valueOf(Arrays.copyOfRange(arr, start, i)));
                    start = -1;
                }
                tokens.add(String.valueOf(arr[i]));
            } else {
                if (start == -1)
                    start = i;
            }
        }
        String[] tokensArray = new String[tokens.size()];
        return tokens.toArray(tokensArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expr = "(8+5)/(4+56*6)";
        //StringTokenizer tokenizer = new StringTokenizer(expr, "()+-/*", true);
//        while(tokenizer.hasMoreTokens()) {
//            System.out.println(tokenizer.nextToken());
//        }

        String[] tokens = tokenize(expr);
        for (String s : tokens) {
            System.out.print(s + " ");
        }
    }
}
