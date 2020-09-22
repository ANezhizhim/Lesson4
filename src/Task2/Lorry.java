package Task2;

public class Lorry extends  Car {
protected int capacity;

    public  Lorry(String lrCarModel, String lrCarClass, int lrCapacity, Engine lrEngine){
        this.carModel=lrCarModel;
        this.carClass=lrCarClass;
        this.capacity=lrCapacity;
        this.engine=lrEngine;

    }
    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }
    @Override
    public void printInfo() {
        System.out.println("Марка авто:"+this.carModel);
        System.out.println("Класс авто:"+this.carClass);
        System.out.println("Грузоподъемность авто:"+this.capacity);
        System.out.println("Двигатель авто: произвоитель-"+this.engine.manufacturer+"; мощность-"+this.engine.power+" л.с.");
    }
}
