package _4_ISP.start.model;

public class VehicleConsoleDisplayer implements VehicleDisplayer {

    @Override
    public void display(String vehicleInfo) {
        System.out.println(vehicleInfo);
    }
}
