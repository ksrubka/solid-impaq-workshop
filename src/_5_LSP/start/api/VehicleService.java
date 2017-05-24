package _5_LSP.start.api;

import _5_LSP.start.model.EngineVehicle;
import _5_LSP.start.model.Vehicle;

public class VehicleService {

    private VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public void add(Vehicle vehicle) {
        vehicleRepository.add(vehicle);
    }

    public void display(long id) {
        Vehicle vehicle = vehicleRepository.get(id);
        if (vehicle != null)
            vehicle.display();
        else
            System.out.println("No vehicle in repository with id: " + id);
    }

    public void startEngine(long id) {
        Vehicle vehicle = vehicleRepository.get(id);
        if (vehicle != null && hasEngine(vehicle)) {
            EngineVehicle engineVehicle = (EngineVehicle) vehicle;
            engineVehicle.startEngine();
        }
        else
            System.out.println("No engine vehicle in repository with id: " + id);
    }

    private boolean hasEngine(Vehicle vehicle) {
        return vehicle instanceof EngineVehicle;
    }
}
