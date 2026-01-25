package labs.lab0;

public class Rectangle implements Shape {

    private final double width;
    private final double height;

    //instantiate instance variables
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // use width and height to display these values during demo.
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }
}
