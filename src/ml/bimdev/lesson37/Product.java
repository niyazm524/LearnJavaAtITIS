package ml.bimdev.lesson37;

class Product {
    private boolean isReady;

    boolean isProduced() {
        return isReady;
    }

    boolean isConsumed() {
        return !isReady;
    }

    void produce() {
        isReady = true;
    }

    void consume() {
        isReady = false;
    }
}
