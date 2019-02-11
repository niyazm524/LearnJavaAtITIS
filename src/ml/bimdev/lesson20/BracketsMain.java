package ml.bimdev.lesson20;

import java.util.Scanner;

public class BracketsMain {
    static char[] openBrackets = {'(', '{', '['};
    static char[] closeBrackets = {')', '}', ']'};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s == "" ? "{[7+5)*3+7]-10}/7" : s;

        System.out.println(isBracketsCorrect(s));
    }

    static boolean isBracketsCorrect(String s) {
        Stack stack = new LinkedStack();
        char[] symbols = s.toCharArray();
        for (int i = 0; i < symbols.length; i++) {
            char c = symbols[i];
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (c == ')' || c == ']' || c == '}') {
                    if (!stack.isEmpty()) {
                        char bracketFromStack = stack.pop();
                        if (c == ')' && bracketFromStack != '(') {
                            return false;
                        }
                        if (c == '}' && bracketFromStack != '{') {
                            return false;
                        }
                        if (c == ']' && bracketFromStack != '[') {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    static boolean isInArray(char[] arr, char c) {
        for (char c1 : arr) {
            if (c1 == c) return true;
        }
        return false;
    }
}
