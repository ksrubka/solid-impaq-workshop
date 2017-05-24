package _5_LSP.end.model.vehicle.impl;

import _5_LSP.end.model.vehicle.Vehicle;

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
