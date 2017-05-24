package _2_DIP.start;

import java.util.HashMap;
import java.util.Map;

public class CarRepository {

    private Map<Long, Car> carRepo = new HashMap<>();
    private long currentCarId = 1;

    {
        addCar(new Car(100, "Fiat 126p"));
        addCar(new Car(200, "Mazda mx-5"));
        addCar(new Car(340, "Ferrari Spider"));
    }

    public Car get(long id) {
        return carRepo.get(id);
    }

    public void addCar(Car car) {
        car.setId(currentCarId);
        carRepo.put(currentCarId, car);
        currentCarId++;
    }
}
