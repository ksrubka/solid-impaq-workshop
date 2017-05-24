package _5_LSP.end.api;

import _5_LSP.end.model.vehicle.Vehicle;

public interface VehicleRepository {

    Vehicle get(long id);

    void add(Vehicle vehicle);
}
