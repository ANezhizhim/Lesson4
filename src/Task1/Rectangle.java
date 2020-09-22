package Task1;

public class Rectangle implements Shape{
    private double h=10.0;
    private double a=20.0;

    @Override
    public double square() {
        return a*h;
    }

}
