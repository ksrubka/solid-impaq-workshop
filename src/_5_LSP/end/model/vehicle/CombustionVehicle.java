package _5_LSP.end.model.vehicle;

public abstract class CombustionVehicle extends EngineVehicle {

    protected int fuelLevel;
    protected int maxFuelLevel;

    public CombustionVehicle(int maxSpeed, int maxFuelLevel) {
        super(maxSpeed);
        this.maxFuelLevel = maxFuelLevel;
    }

    public void fuelUp(int fuelLiters) {
        if (canFuelUp(fuelLiters)) {
            fuelLevel += fuelLiters;
            System.out.println("Fueled! Current fuel level: " + fuelLevel + "\n");
        }
        else {
            System.out.println("Sorry, too much fuel.");
        }
    }

    private boolean canFuelUp(int fuelLiters) {
        System.out.println("can fuel?\n(maxFuelLevel - fuelLevel) <= fuelLiters\n" +
        "(" + maxFuelLevel + " - "  + fuelLevel + ") >= " + fuelLiters + "\n");
        return (maxFuelLevel - fuelLevel) >= fuelLiters;
    }

    protected String getMoreInfo() {
        return "\nmax fuel tank capacity: " + maxFuelLevel + " liters";
    }
}
