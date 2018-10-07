package ml.bimdev.lesson09;

class TransportingCar {
    int width;
    int height;
    int length;
    int weight;
    int volume;

    public TransportingCar(int width, int height, int length, int weight) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.weight = weight;
        this.volume = height * width * length;

    }
}