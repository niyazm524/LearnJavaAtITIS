package ml.bimdev.lesson19;

class Calculator {
    int fact(int n) {
        if (n < 0) throw new IllegalArgumentException("Wrong parameter: " + n);
        return n == 1 ? 1 : n * fact(n - 1);
    }

    boolean isSquare(int n) {
        int s = (int) Math.sqrt(n);
        return s * s == n;
    }

}
