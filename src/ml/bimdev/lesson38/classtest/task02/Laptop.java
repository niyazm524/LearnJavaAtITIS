package ml.bimdev.lesson38.classtest.task02;

public class Laptop {
    private int price;
    private int computingPower;
    private boolean isIntelPowered;
    private int batteryMAH;

    public Laptop(int price, int computingPower, boolean isIntelPowered, int batteryMAH) {
        this.price = price;
        this.computingPower = computingPower;
        this.isIntelPowered = isIntelPowered;
        this.batteryMAH = batteryMAH;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getComputingPower() {
        return computingPower;
    }

    public void setComputingPower(int computingPower) {
        this.computingPower = computingPower;
    }

    public boolean isIntelPowered() {
        return isIntelPowered;
    }

    public void setIntelPowered(boolean intelPowered) {
        isIntelPowered = intelPowered;
    }

    public int getBatteryMAH() {
        return batteryMAH;
    }

    public void setBatteryMAH(int batteryMAH) {
        this.batteryMAH = batteryMAH;
    }
}
