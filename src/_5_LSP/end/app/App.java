package _5_LSP.end.app;

import _5_LSP.end.api.VehicleService;
import _5_LSP.end.model.Chargepoint;
import _5_LSP.end.model.GasStation;
import _5_LSP.end.model.vehicle.CombustionVehicle;
import _5_LSP.end.model.vehicle.ElectricVehicle;
import _5_LSP.end.model.vehicle.impl.Bike;
import _5_LSP.end.model.vehicle.impl.Car;
import _5_LSP.end.model.vehicle.impl.ElectricCar;
import _5_LSP.end.model.vehicle.impl.Quad;
import _5_LSP.end.repository.VehicleMapRepository;

public class App {

    public static void main(String[] args) {
        VehicleService vehicleService = new VehicleService(new VehicleMapRepository());

        vehicleService.add(new Car(180, 52, "Opel Astra"));
        vehicleService.add(new Bike(60, "mountain"));
        vehicleService.add(new Quad(70, 10, true));
        vehicleService.add(new ElectricCar(250, 85, "TESLA s85D"));

        vehicleService.display(1);
        vehicleService.display(4);
        vehicleService.display(5);
        vehicleService.display(6);
        vehicleService.display(8);
        vehicleService.display(10);

        vehicleService.startEngine(8);
        vehicleService.startEngine(4);
        vehicleService.startEngine(6);

        CombustionVehicle maluch = (CombustionVehicle) vehicleService.get(1);
        CombustionVehicle astra = (CombustionVehicle) vehicleService.get(5);

        GasStation gasStation = new GasStation();
        gasStation.fill(maluch, 15);
        gasStation.fill(astra, 55);

        ElectricVehicle tesla = (ElectricVehicle) vehicleService.get(8);

        Chargepoint chargepoint = new Chargepoint();
        chargepoint.charge(tesla);
    }
}