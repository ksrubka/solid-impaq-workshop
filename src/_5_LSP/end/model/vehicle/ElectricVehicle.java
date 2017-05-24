package _5_LSP.end.model.vehicle;

public abstract class ElectricVehicle extends EngineVehicle {

    protected int maxChargeLevelKWH;
    protected int chargeLevel;

    public ElectricVehicle(int maxSpeed, int maxChargeLevelKWH) {
        super(maxSpeed);
        this.maxChargeLevelKWH = maxChargeLevelKWH;
    }

    public void charge() {
        while (vahicleIsNotCharged()) {
            chargeLevel++;
        }
        defaultCharge();
        System.out.println(" charged!\n");
    }

    protected abstract void defaultCharge();

    private boolean vahicleIsNotCharged() {
        return chargeLevel != maxChargeLevelKWH;
    }

    protected String getMoreInfo() {
        return "\nmax charging capacity: " + maxChargeLevelKWH + " kWh";
    }
}
