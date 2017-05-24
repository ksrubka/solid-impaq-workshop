package _4_ISP.start.model;

public abstract class Vehicle {

    protected Long id;
    protected int maxSpeed;
    protected VehicleDisplayer displayer;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.displayer = new CoolVehicleConsoleDisplayer();
    }

    protected abstract String getMoreInfo();

    public void startEngine() {
        System.out.println("engine started");
    }

    public void display() {
        StringBuilder info = new StringBuilder();
        info.append(getClass().getSimpleName());
        info.append("\nmax speed: " + maxSpeed);
        info.append(getMoreInfo());
        displayer.display(info.toString());
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
