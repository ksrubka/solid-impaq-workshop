package _4_ISP.start.api;

import _4_ISP.start.model.Vehicle;

public interface VehicleRepository {

    Vehicle get(long id);

    void add(Vehicle vehicle);
}
