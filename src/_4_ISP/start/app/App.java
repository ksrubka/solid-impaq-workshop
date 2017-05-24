package _4_ISP.start.app;

import _4_ISP.start.api.VehicleService;
import _4_ISP.start.model.Car;
import _4_ISP.start.model.Quad;
import _4_ISP.start.repositories.VehicleMapRepository;

public class App {

    public static void main(String[] args) {
        VehicleService vehicleService = new VehicleService(new VehicleMapRepository());

        vehicleService.add(new Car(180, "Opel Astra"));
        vehicleService.add(new Quad(70, true));

        vehicleService.display(1);
        vehicleService.display(2);
        vehicleService.display(4);
        vehicleService.display(5);
        vehicleService.display(10);
    }
}