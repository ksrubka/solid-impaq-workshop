package _5_LSP.end.model.vehicle.impl;

import _5_LSP.end.model.vehicle.CombustionVehicle;

public class Quad extends CombustionVehicle {

    private boolean hasEngineCover;

    public Quad(int maxSpeed, int maxFuelLevel, boolean hasEngineCover) {
        super(maxSpeed, maxFuelLevel);
        this.hasEngineCover = hasEngineCover;
    }

    @Override
    protected String getMoreInfo() {
        return "\nengine cover: " + hasEngineCover +
                super.getMoreInfo();
    }

    @Override
    protected void defaultEngineStart() {
        System.out.print("Quad ");
    }
}
