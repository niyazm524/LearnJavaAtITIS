package ml.bimdev.lesson04;

import java.util.Random;

public class Primitives {
    public static void main(String[] args) {
        char letter = (char) ((new Random()).nextInt() % 26 + 'A');
        System.out.println(letter);

        if (letter >= 'A' && letter <= 'Z')
            letter = (char) (letter + 32);
        else if (letter >= 'a' && letter <= 'z')
            letter = (char) (letter - 32);

        System.out.println(letter);
    }
}
