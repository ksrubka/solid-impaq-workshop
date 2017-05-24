package _5_LSP.end.model.vehicle.impl;

import _5_LSP.end.model.vehicle.CombustionVehicle;

public class Car extends CombustionVehicle {

    private String model;

    public Car(int maxSpeed, int maxFuelLevel, String model) {
        super(maxSpeed, maxFuelLevel);
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
        return "\nmodel: " + model +
                super.getMoreInfo();
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    protected void defaultEngineStart() {
        System.out.print("Car ");
    }
}
