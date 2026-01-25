package labs.lab0;

public class ShapeDemo {
    public static void main(String[] args) {
        // TEST 1 - easy calculations
        Rectangle rec1 = new Rectangle(3,5);
        Triangle tri1 = new Triangle(3,5);
        Circle circ1 = new Circle(3);

        System.out.println("Rectangle 1:\n| Width: " + rec1.getWidth()
                + "\n| Height: " + rec1.getHeight()
                + "\n| Area: " + rec1.getArea());

        System.out.println("\nTriangle 1:\n| Base: " + tri1.getBase()
                + "\n| Height: " + tri1.getHeight()
                + "\n| Area: " + tri1.getArea());

        System.out.println("\nCircle 1:\n| Radius: " + circ1.getRadius()
                + "\n| Area: " + circ1.getArea());

        // TEST 2 - random numbers
        Rectangle rec2 = new Rectangle(100,500);
        Triangle tri2 = new Triangle(254,934);
        Circle circ2 = new Circle(45);

        System.out.println("\nRectangle 2:\n| Width: " + rec2.getWidth()
                + "\n| Height: " + rec2.getHeight()
                + "\n| Area: " + rec2.getArea());

        System.out.println("\nTriangle 2:\n| Base: " + tri2.getBase()
                + "\n| Height: " + tri2.getHeight()
                + "\n| Area: " + tri2.getArea());

        System.out.println("\nCircle 2:\n| Radius: " + circ2.getRadius()
                + "\n| Area: " + circ2.getArea());

        // END TEST
    }
}
