package _5_LSP.start.model;

public abstract class EngineVehicle extends Vehicle {

    public EngineVehicle(int maxSpeed) {
        super(maxSpeed);
    }

    // Design Pattern: Template Method
    public void startEngine() {
        defaultEngineStart();
        System.out.println("engine started");
    }

    protected abstract void defaultEngineStart();
}
