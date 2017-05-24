package _5_LSP.end.model.displayer.impl;

import _5_LSP.end.model.displayer.VehicleDisplayer;

import java.util.Random;

public class CoolVehicleConsoleDisplayer implements VehicleDisplayer {

    private static final int superWordsCount = 11;
    private String[] superWords = {"WOW", "cool", "wow !!", "Super", "so nice!", "RAD", "excellent", "great!!!", "Yeah !",
            "COOL", "hot one!!"};

    @Override
    public void display(String vehicleInfo) {
        printRandomSuperWord();
        System.out.println(vehicleInfo);
        printRandomSuperWord();
        System.out.println();
    }

    private void printRandomSuperWord() {
        System.out.println("####\t" + superWords[getRandomPosition()] + "\t####");
    }

    private int getRandomPosition() {
        return new Random().nextInt(superWordsCount);
    }
}
