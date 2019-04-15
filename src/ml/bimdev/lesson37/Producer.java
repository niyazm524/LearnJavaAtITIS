package ml.bimdev.lesson37;

public class Producer extends Thread {
    private final Product product;

    public Producer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        while(true) {
            synchronized (product) {
                while (!product.isConsumed()) {
                    try {
                        product.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Потреблен ли продукт?");
                }
                product.produce();
                product.notify();
                System.out.println("Произведен");
            }

        }
    }
}
