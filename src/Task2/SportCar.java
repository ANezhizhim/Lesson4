package Task2;

public class SportCar extends Car {
    protected int maxSpeed;

    public SportCar(String spkCarModel, String spkCarClass, int spkMaxSpeed, Engine spkEngine) {
        this.carModel = spkCarModel;
        this.carClass = spkCarClass;
        this.maxSpeed = spkMaxSpeed;
        this.engine = spkEngine;

    }


    @Override
    public void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился");

    }

    @Override
    public void printInfo() {

        System.out.println("Марка авто:" + this.carModel);
        System.out.println("Класс авто:" + this.carClass);
        System.out.println("Макс. скорость авто:" + this.maxSpeed);
        System.out.println("Двигатель авто: произвоитель-" + this.engine.manufacturer + "; мощность-" + this.engine.power + " л.с.");
    }
}
