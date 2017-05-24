package _2_DIP.start;

public class CarDisplayer {

    public void display(Car car) {
        System.out.println(
                "model: " + car.getModel() + "\nmax speed: " + car.getMaxSpeed() + "\n");
    }
}
