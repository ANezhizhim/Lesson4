package Task2;

public class SportCar extends Car {
    protected int maxSpeed;
    public  SportCar(String spk_carModel, String spk_carClass, int spk_maxSpeed, Engine spk_engine){
        this.carModel=spk_carModel;
        this.carClass=spk_carClass;
        this.maxSpeed=spk_maxSpeed;
        this.engine=spk_engine;

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

        System.out.println("Марка авто:"+this.carModel);
        System.out.println("Класс авто:"+this.carClass);
        System.out.println("Макс. скорость авто:"+this.maxSpeed);
        System.out.println("Двигатель авто: произвоитель-"+this.engine.manufacturer+"; мощность-"+this.engine.power+" л.с.");
    }
}
