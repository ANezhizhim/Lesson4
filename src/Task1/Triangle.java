package Task1;

public class Triangle implements Shape{
    private double h=10.0;
    private double a=20.0;

    @Override
    public double square() {
        return 0.5*(a+h);
    }
}
