package ml.bimdev.lesson09;

class RacingCar {
    // Fields (поля)
    String color;
    int weight;
    int maxSpeed;
    int currentSpeed;

    RacingCar(String color, int weight, int maxSpeed) {
        this.color = color;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }

    RacingCar() {
    }

    void accelerate(int kmH) {
        currentSpeed += kmH;
    }
}
