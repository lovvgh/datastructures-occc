package labs.lab0;

public class Triangle implements Shape {

    private final double base;
    private final double height;

    //instantiate instance variables
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // use base and height to display these values during demo.
    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}
