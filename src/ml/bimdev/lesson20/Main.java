package ml.bimdev.lesson20;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push('p');
        stack.push('o');
        System.out.println(stack.pop() + " " + stack.pop());

        System.out.println(reverseString("Hello"));

    }

    static String reverseString(String s) {
        Stack stack = new Stack(s.length());
        char[] oldArr = s.toCharArray();
        char[] arr = new char[s.length()];
        for (char c : oldArr)
            stack.push(c);
        for (int i = 0; i < s.length(); i++) {
            arr[i] = stack.pop();
        }
        return String.valueOf(arr);
    }
}
