package _5_LSP.end.model.vehicle;

public abstract class EngineVehicle extends Vehicle {

    public EngineVehicle(int maxSpeed) {
        super(maxSpeed);
    }

    // Design Pattern: Template Method
    public void startEngine() {
        defaultEngineStart();
        System.out.println("engine started\n");
    }

    protected abstract void defaultEngineStart();
}
