package _4_ISP.start.model;

public class Quad extends Vehicle {

    private boolean hasEngineCover;

    public Quad(int maxSpeed, boolean hasEngineCover) {
        super(maxSpeed);
        this.hasEngineCover = hasEngineCover;
    }

    @Override
    protected String getMoreInfo() {
        return "\nengine cover: " + hasEngineCover;
    }

    public void startEngine() {
        System.out.print("Car ");
        super.startEngine();
    }
}
