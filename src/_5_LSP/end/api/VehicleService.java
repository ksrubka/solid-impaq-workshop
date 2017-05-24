package _5_LSP.end.api;

import _5_LSP.end.model.vehicle.EngineVehicle;
import _5_LSP.end.model.vehicle.Vehicle;

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
            System.out.println("Sorry, can not display. No vehicle in repository with id: " + id + "\n");
    }

    public void startEngine(long id) {
        Vehicle vehicle = vehicleRepository.get(id);
        if (vehicle != null && hasEngine(vehicle)) {
            EngineVehicle engineVehicle= (EngineVehicle) vehicle;
            engineVehicle.startEngine();
        }
        else
            System.out.println("Sorry, no engine to start. No engine vehicle in repository with id: " + id + "\n");
    }

    private boolean hasEngine(Vehicle vehicle) {
        return vehicle instanceof EngineVehicle;
    }

    public Vehicle get(int id) {
        return vehicleRepository.get(id);
    }
}
