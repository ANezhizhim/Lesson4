package Task1;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Triangle(10.0D, 10.0D);
        shape[1] = new Circle(10.0D);
        shape[2] = new Rectangle(10.0D, 20.0D);

        for (Shape sh : shape) {
            System.out.println("Площадь фигуры: " + sh.square());
        }
    }
}
/*
/*
Замечания:
Почему значения полей захардкожены?
3.14D – лучше использоваться Math.PI.

1.Создать интерфейс Shape с методом square, который возвращает площадь фигуры.
2.Создать классы: Circle, Triangle, Rectangle реализующие этот интерфейс
3.Метод main  должен выглядеть так:
public static void main(String[] args) {
    Shape[] shape = new Shape[3];
    shape[0] = new Triangle();
    shape[1] = new Circle();
    shape[2] = new Rectangle();
    for (Shape sh: shape){
        System.out.println("Площадь фигуры: "+sh.square());
    }
}

 */