package _5_LSP.end.model;

import _5_LSP.end.model.vehicle.CombustionVehicle;

public class GasStation {

    public void fill(CombustionVehicle vehicle, int liters) {
        vehicle.fuelUp(liters);
    }
}
