package _5_LSP.start.model;

public abstract class Vehicle {

    protected Long id;
    protected int maxSpeed;
    protected VehicleDisplayer displayer;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.displayer = new CoolVehicleConsoleDisplayer();
    }

    protected abstract String getMoreInfo();

    public void display() {
        displayer.display(prepareInfo());
    }

    private String prepareInfo() {
        return getClass().getSimpleName() +
                "\nmax speed: " + maxSpeed +
                getMoreInfo();
    }
}
