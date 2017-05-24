package _4_ISP.start.api;

import _4_ISP.start.model.Vehicle;

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
        if (vehicle != null)
            vehicle.startEngine();
        else
            System.out.println("No vehicle in repository with id: " + id);
    }
}
