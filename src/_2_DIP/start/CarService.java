package _2_DIP.start;

public class CarService {

    private CarRepository carRepository;
    private CarDisplayer carDisplayer;

    public CarService(CarRepository carRepository, CarDisplayer carDisplayer) {
        this.carRepository = carRepository;
        this.carDisplayer = carDisplayer;
    }

    public void addCar(Car car) {
        carRepository.addCar(car);
    }

    public void displayCar(long carId) {
        Car car = carRepository.get(carId);
        if (car != null)
            carDisplayer.display(car);
        else
            System.out.println("No car in repository with id: " + carId);
    }
}
