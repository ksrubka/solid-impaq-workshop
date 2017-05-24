package _3_OCP.start.api;

import _3_OCP.start.api.CarDisplayer;
import _3_OCP.start.model.Car;
import _4_ISP.start.model.VehicleDisplayer;

import java.util.Random;

public class CoolCarConsoleDisplayer implements CarDisplayer {

    private static final int superWordsCount = 11;
    private String[] superWords = {"WOW", "cool", "wow !!", "Super", "so nice!", "RAD", "excellent", "great!!!", "Yeah !",
            "COOL", "hot one!!"};

    @Override
    public void display(Car car) {
        printRandomSuperWord();
        System.out.println(getInfo(car));
        printRandomSuperWord();
        System.out.println();
    }

    private void printRandomSuperWord() {
        System.out.println("####\t" + superWords[getRandomPosition()] + "\t####");
    }

    private int getRandomPosition() {
        return new Random().nextInt(superWordsCount);
    }

    private String getInfo(Car car) {
        return  "model: " + car.getModel() + "\nmax speed: " + car.getMaxSpeed() + "\n";
    }
}
