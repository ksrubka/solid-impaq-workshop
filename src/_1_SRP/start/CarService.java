package _1_SRP.start;

import java.util.HashMap;
import java.util.Map;

public class CarService {

    Map<Long, Car> carRepo = new HashMap<Long, Car>();
    long currentCarId = 1;

    {
        addCar(new Car(100, "Fiat 126p"));
        addCar(new Car(200, "Mazda mx-5"));
        addCar(new Car(340, "Ferrari Spider"));
    }

    public void addCar(Car car) {
        car.setId(currentCarId);
        carRepo.put(currentCarId, car);
        currentCarId++;
    }

    public void displayCar(long carId) {
        Car car = carRepo.get(carId);
        if (car != null) {
            System.out.println(
                    "model: " + car.getModel() +
                    "\nmax speed: " + car.getMaxSpeed() + "\n");
        }
        else {
            System.out.println("No car in repository with id: " + carId + "\n");
        }
    }
}