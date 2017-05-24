package _5_LSP.start.model;

public class Quad extends EngineVehicle {

    private boolean hasEngineCover;

    public Quad(int maxSpeed, boolean hasEngineCover) {
        super(maxSpeed);
        this.hasEngineCover = hasEngineCover;
    }

    @Override
    protected String getMoreInfo() {
        return "\nengine cover: " + hasEngineCover;
    }

    @Override
    protected void defaultEngineStart() {
        System.out.print("Quad ");
    }
}
