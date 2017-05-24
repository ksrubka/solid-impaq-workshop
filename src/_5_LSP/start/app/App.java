package _5_LSP.start.app;

import _5_LSP.start.model.Bike;
import _5_LSP.start.model.Car;
import _5_LSP.start.model.Quad;
import _5_LSP.start.api.VehicleService;
import _5_LSP.start.repositories.VehicleMapRepository;

public class App {

    public static void main(String[] args) {
        VehicleService vehicleService = new VehicleService(new VehicleMapRepository());

        vehicleService.add(new Car(180, "Opel Astra"));
        vehicleService.add(new Bike(60, "mountain"));
        vehicleService.add(new Quad(70, true));

        vehicleService.display(1);
        vehicleService.display(4);
        vehicleService.display(5);
        vehicleService.display(6);
        vehicleService.display(10);
    }
}