package _3_OCP.start.api;

import _3_OCP.start.api.CarDisplayer;
import _3_OCP.start.model.Car;

public class ConsoleCarDisplayer implements CarDisplayer {

    @Override
    public void display(Car car) {
            System.out.println(
                    "model: " + car.getModel() + "\nmax speed: " + car.getMaxSpeed() + "\n");
    }
}
