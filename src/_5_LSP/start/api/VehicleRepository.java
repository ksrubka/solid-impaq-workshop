package _5_LSP.start.api;

import _5_LSP.start.model.Vehicle;

public interface VehicleRepository {

    Vehicle get(long id);

    void add(Vehicle vehicle);
}
