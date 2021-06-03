package automationLesson7;

import automationLesson7.model.Car;
import automationLesson7.model.EngineType;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car(EngineType.ROCKET,6, 10);
        car.ride();
    }
}
