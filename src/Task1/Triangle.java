package Task1;

public class Triangle implements Shape{
    private double H=10.0;
    private double A=20.0;

    @Override
    public double square() {
        return 0.5*(A+H);
    }
}
