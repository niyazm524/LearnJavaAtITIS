package ml.bimdev.lesson06.homework;

import java.util.Arrays;

public class LTrimString {

    private static String lTrim(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!Character.isSpaceChar(chars[i]))
                return String.valueOf(Arrays.copyOfRange(chars, i, chars.length));
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(lTrim("           abc "));
    }
}
