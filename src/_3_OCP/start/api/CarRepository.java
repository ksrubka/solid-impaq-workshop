package _3_OCP.start.api;

import _3_OCP.start.model.Car;

public interface CarRepository {

    Car get(long id);
    void addCar(Car car);
}
