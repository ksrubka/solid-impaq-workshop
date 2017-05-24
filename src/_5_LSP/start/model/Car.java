package _5_LSP.start.model;

public class Car extends EngineVehicle {

    private String model;

    public Car(int maxSpeed, String model) {
        super(maxSpeed);
        this.model = model;
    }

    public Long getId() {
        return super.id;
    }

    public String getModel() {
        return model;
    }

    @Override
    protected String getMoreInfo() {
        return "\nmodel: " + model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    protected void defaultEngineStart() {
        System.out.print("Car ");
    }
}
