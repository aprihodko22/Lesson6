package automationLesson7.model;

public enum EngineType {
    TURBO("Fast start", 2),
    DYNAMO("Slow start", 1),
    ROCKET("Super fast", 5);

    private String startMessage;

    private int fuelPerKm;

    EngineType(String startMessage, int fuelPerKm) {
        this.startMessage = startMessage;
        this.fuelPerKm = fuelPerKm;
    }

    public String getStartMessage() {
        return startMessage;
    }

    public int getFuelPerKm() {
        return fuelPerKm;
    }
}
