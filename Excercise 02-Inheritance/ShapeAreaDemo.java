class Rectangle {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void printArea() {
        System.out.println("Area: " + (length * breadth));
    }

    public void printPerimeter() {
        System.out.println("Perimeter: " + (2 * (length + breadth)));
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}

public class ShapeAreaDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 7);
        System.out.println("Rectangle (5x7):");
        rect.printArea();
        rect.printPerimeter();

        Square sq = new Square(4);
        System.out.println("\nSquare (Side 4):");
        sq.printArea();
        sq.printPerimeter();
    }
}