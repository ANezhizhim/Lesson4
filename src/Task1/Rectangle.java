package Task1;

public class Rectangle implements Shape {
    private double l;
    private double w;

    public Rectangle(double l , double w) {
        this.l = l;
        this.w=w;

    }
    @Override
    public double square() {
        return l * w;
    }

    @Override
    public void setSize(double... size) {
        l = size[0];
        w = size[1];
    }

}
