package _3_OCP.start.app;

import _3_OCP.start.api.CarService;
import _3_OCP.start.model.Car;
import _3_OCP.start.api.CoolCarConsoleDisplayer;
import _3_OCP.start.repositories.MapCarRepository;

public class CarApp {

    public static void main(String[] args) {
        CarService carService = new CarService(new MapCarRepository(), new CoolCarConsoleDisplayer());

        carService.addCar(new Car(180, "Opel Astra"));

        carService.displayCar(1);
        carService.displayCar(4);
        carService.displayCar(10);
    }
}