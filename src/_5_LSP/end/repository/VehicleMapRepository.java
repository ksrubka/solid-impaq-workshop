package _5_LSP.end.repository;

import _5_LSP.end.model.vehicle.impl.Bike;
import _5_LSP.end.model.vehicle.impl.Car;
import _5_LSP.end.model.vehicle.impl.Quad;
import _5_LSP.end.model.vehicle.Vehicle;
import _5_LSP.end.api.VehicleRepository;

import java.util.HashMap;
import java.util.Map;

public class VehicleMapRepository implements VehicleRepository {

    private Map<Long, Vehicle> repository = new HashMap<>();
    private long currentId = 1;

    {
        add(new Car(100, 21, "Fiat 126p"));
        add(new Car(340, 86, "Ferrari Spider"));
        add(new Bike(40, "city"));
        add(new Quad(60, 9, false));
    }

    @Override
    public Vehicle get(long id) {
        return repository.get(id);
    }

    @Override
    public void add(Vehicle vehicle) {
        vehicle.setId(currentId);
        repository.put(currentId, vehicle);
        currentId++;
    }
}
