package _4_ISP.start.model;

public class Car extends Vehicle {

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

    public void startEngine() {
        System.out.print("Car ");
        super.startEngine();
    }
}
