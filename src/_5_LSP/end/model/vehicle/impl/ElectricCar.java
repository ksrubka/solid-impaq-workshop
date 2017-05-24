package _5_LSP.end.model.vehicle.impl;

import _5_LSP.end.model.vehicle.ElectricVehicle;

public class ElectricCar extends ElectricVehicle {

    private String model;

    public ElectricCar(int maxSpeed, int maxChargeLevelKWH, String model) {
        super(maxSpeed, maxChargeLevelKWH);
        this.model = model;
    }

    @Override
    protected void defaultCharge() {
        System.out.print("\nElectric car " + model);
    }

    protected String getMoreInfo() {
        return "\nmodel: " + model +
                super.getMoreInfo();
    }

    @Override
    protected void defaultEngineStart() {
        System.out.print("Electric car ");
    }
}
