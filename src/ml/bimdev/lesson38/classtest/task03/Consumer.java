package ml.bimdev.lesson38.classtest.task03;


import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Consumer extends Thread {
    private final CharacterProduct product;
    private BufferedWriter writer;

    public Consumer(String filename, CharacterProduct product) throws IOException {
        this.product = product;
        writer = Files.newBufferedWriter(Paths.get(filename));
    }

    @Override
    public void run() {
        try {
            while (true) {
                synchronized (product) {
                    while (!product.isProduced()) {
                        product.wait();
                    }
                    if (product.isFileRead()) {
                        System.out.println("file closed");
                        writer.close();
                        return;
                    }
                    char c = product.consume();
                    // System.out.println("write: " + c);
                    writer.write((int) c);
                    product.notify();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.err.println("Consumer interrupted");
        }

    }
}
