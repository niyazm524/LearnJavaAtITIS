package ml.bimdev.lesson09;

class OOP {
    public static void main(String[] args) {
        RacingCar racingCar = new RacingCar();
        racingCar.color = "red";
        racingCar.maxSpeed = 300;
        racingCar.currentSpeed = 0;
        racingCar.accelerate(20);

    }
}
