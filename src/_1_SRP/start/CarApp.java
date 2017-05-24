package _1_SRP.start;

public class CarApp {

    public static void main(String[] args) {
        CarService carService = new CarService();

        carService.addCar(new Car(180, "Opel Astra"));

        carService.displayCar(1);
        carService.displayCar(4);
        carService.displayCar(10);
        carService.displayCar(3);
    }
}
