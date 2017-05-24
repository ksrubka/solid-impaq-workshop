package _2_DIP.start;

public class Car {

    private Long id;
    private int maxSpeed;
    private String model;

    public Car(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void startEngine() {
        System.out.println("Car engine started");
    }
}
