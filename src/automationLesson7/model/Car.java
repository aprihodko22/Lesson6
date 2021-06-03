package automationLesson7.model;

import java.util.Locale;

public class Car {
    private Engine engine;
    private int fuel;

    public Car(EngineType engine, int fuel) {
        this.engine = new Engine(engine, 8);
        this.fuel = fuel;
    }
    public void ride(){
        engine.start();
        while (this.fuel >0){
            System.out.println("ride!");
            fuel = fuel - engine.type.getFuelPerKm();
        }
        System.out.println("need more fuel!");
    }
    public Car(EngineType engine, int countOfCylinders, int fuel) {
        this.engine = new Engine(engine, countOfCylinders);
        this.fuel = fuel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

   public class Engine{
        private EngineType type;
        private int cylinders;

        public Engine(EngineType type, int cylinders) {
            this.type = type;
            this.cylinders = cylinders;
        }

        public EngineType getType() {
            return type;
        }

        public void setType(EngineType type) {
            this.type = type;
        }

        public int getCylinders() {
            return cylinders;
        }

        public void setCylinders(int cylinders) {
            this.cylinders = cylinders;
        }
        private void start(){
            if(fuel >= 0){
                System.err.println("Need more fuel");
            } else System.out.printf("Starting %s engine with %d cylinders %n", type.toString().toLowerCase(), cylinders, fuel);
        }
    }
}
