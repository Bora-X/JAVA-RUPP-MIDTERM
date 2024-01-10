class Rectangle {
    // Data members
    protected double length;
    protected double width;
    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Methods
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return 2 * (length + width);
    }
}

class Square extends Rectangle {
    // Constructor for Square
    public Square(double side) {
        // Call the constructor of the superclass (Rectangle)
        super(side, side);
    }
}
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        Square square = new Square(3);
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());
    }
}