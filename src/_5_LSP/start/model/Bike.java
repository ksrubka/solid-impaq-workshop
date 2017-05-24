package _5_LSP.start.model;

public class Bike extends Vehicle {

    private String type;

    public Bike(int maxSpeed, String type) {
        super(maxSpeed);
        this.type = type;
    }

    @Override
    protected String getMoreInfo() {
        return "\ntype: " + type;
    }
}
