package _4_ISP.start.repositories;

import _4_ISP.start.api.VehicleRepository;
import _4_ISP.start.model.Car;
import _4_ISP.start.model.Quad;
import _4_ISP.start.model.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class VehicleMapRepository implements VehicleRepository {

    private Map<Long, Vehicle> repository = new HashMap<>();
    private long currentId = 1;

    {
        add(new Car(100, "Fiat 126p"));
        add(new Car(340, "Ferrari Spider"));
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
