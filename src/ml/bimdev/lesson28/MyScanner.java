package ml.bimdev.lesson28;

import java.io.IOException;
import java.io.InputStream;

class MyScanner {
    private InputStream is;

    public MyScanner(InputStream is) {
        this.is = is;
    }

    public int nextInt() {
        return 0;
    }

    public double nextDouble() {
        return 0;
    }

    public String next() {
        return null;
    }

    public String nextLine() {
        StringBuilder sb = new StringBuilder();
        int nextByte;
        try {
            while ((nextByte = is.read()) != ((int) '\n') && nextByte != -1) {
                if (is.available() > 0) {
                    sb.append((char) nextByte);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}