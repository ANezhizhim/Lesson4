package Task1;

public class Circle implements Shape {
    public double R=10.0;


    @Override
    public double square() {
        return 0.5*(3.14D*R*R);
    }
}
