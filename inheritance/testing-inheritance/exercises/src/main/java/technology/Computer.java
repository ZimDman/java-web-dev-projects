package technology;

public class Computer {

    private double weight;

    private double size;

    private boolean touchscreen = false;

    private double RAM;

    public Computer (double aWeight, boolean aTouchscreen, double aRAM, double aSize) {
        weight = aWeight;
        touchscreen = aTouchscreen;
        RAM = aRAM;
        size = aSize;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getRAM() {
        return RAM;
    }

    public void setRAM(double RAM) {
        this.RAM = RAM;
    }

    public boolean isTouchscreen() {
        return touchscreen;
    }

    public void setTouchscreen(boolean touchscreen) {
        this.touchscreen = touchscreen;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    
}
