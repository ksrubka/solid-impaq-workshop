package _5_LSP.end.model.displayer.impl;


import _5_LSP.end.model.displayer.VehicleDisplayer;

public class VehicleConsoleDisplayer implements VehicleDisplayer {

    @Override
    public void display(String vehicleInfo) {
        System.out.println(vehicleInfo);
    }
}
