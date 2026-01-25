package labs.lab0;

public class Circle implements Shape {

    private final double radius;

    //instantiate instance variable
    public Circle(double radius) {
        this.radius = radius;
    }

    // use radius to display this value during demo.
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
