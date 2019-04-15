package ml.bimdev.lesson37;

public class Consumer extends Thread {
    private final Product product;

    public Consumer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        try {
            while(true) {
                synchronized (product) {
                    while (!product.isProduced()) {
                        product.wait();
                        System.out.println("Произведен ли продукт?");
                    }
                    product.consume();
                    product.notify();
                    System.out.println("употребил");
                }
            }
        } catch (InterruptedException e) {
            System.err.println("Consumer interrupted");
        }

    }
}
