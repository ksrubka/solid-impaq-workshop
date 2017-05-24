package _5_LSP.end.model.vehicle;

import _5_LSP.end.model.displayer.impl.CoolVehicleConsoleDisplayer;
import _5_LSP.end.model.displayer.VehicleDisplayer;

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
                "\nid: " + id +
                "\nmax speed: " + maxSpeed + " km/h" +
                getMoreInfo();
    }

    public void setId(long id) {
        this.id = id;
    }
}
