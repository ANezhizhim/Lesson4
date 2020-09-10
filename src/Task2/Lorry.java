package Task2;

public class Lorry extends  Car {
protected int capacity;

    public  Lorry(String lr_carModel, String lr_carClass, int lr_capacity, Engine lr_engine){
        this.carModel=lr_carModel;
        this.carClass=lr_carClass;
        this.capacity=lr_capacity;
        this.engine=lr_engine;

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
