package Task1;

public class Rectangle implements Shape{
    private double H=10.0;
    private double A=20.0;

    @Override
    public double square() {
        return A*H;
    }

}
