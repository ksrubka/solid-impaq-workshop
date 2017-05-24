package _5_LSP.start.repositories;

import _5_LSP.start.model.Bike;
import _5_LSP.start.model.Car;
import _5_LSP.start.model.Quad;
import _5_LSP.start.model.Vehicle;
import _5_LSP.start.api.VehicleRepository;

import java.util.HashMap;
import java.util.Map;

public class VehicleMapRepository implements VehicleRepository {

    private Map<Long, Vehicle> repository = new HashMap<>();
    private long currentId = 1;

    {
        add(new Car(100, "Fiat 126p"));
        add(new Car(340, "Ferrari Spider"));
        add(new Bike(40, "city"));
        add(new Quad(60, false));
    }

    @Override
    public Vehicle get(long id) {
        return repository.get(id);
    }

    @Override
    public void add(Vehicle vehicle) {
        repository.put(currentId, vehicle);
        currentId++;
    }
}
