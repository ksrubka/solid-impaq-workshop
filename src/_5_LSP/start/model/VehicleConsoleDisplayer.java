package _5_LSP.start.model;


public class VehicleConsoleDisplayer implements VehicleDisplayer {

    @Override
    public void display(String vehicleInfo) {
        System.out.println(vehicleInfo);
    }
}
