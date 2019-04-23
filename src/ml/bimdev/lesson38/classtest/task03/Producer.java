package ml.bimdev.lesson38.classtest.task03;


import java.io.*;
import java.nio.charset.Charset;

public class Producer extends Thread {
    private final CharacterProduct product;
    private BufferedReader reader;

    public Producer(String filename, CharacterProduct product) throws FileNotFoundException {
        this.product = product;
        reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(filename),
                        Charset.forName("UTF-8")));

    }

    @Override
    public void run() {
        int c;
        try {
            while ((c = reader.read()) != -1) {
                synchronized (product) {
                    while (!product.isConsumed()) {
                        product.wait();
                    }
                    // System.out.println("read: " + (char)c);
                    product.produce((char) c);
                    product.notify();
                }
            }
            synchronized (product) {
                while (!product.isConsumed()) {
                    product.wait();
                }
                System.out.println("file read");
                product.setFileReaded(true);
                product.produce('\0');
                product.notify();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
        }
    }
}
