class Shape {
    public void printShape() {
        System.out.println("This is shape");
    }
}

class RectangleShape extends Shape {
    public void printRectangle() {
        System.out.println("This is rectangular shape");
    }
}

class CircleShape extends Shape {
    public void printCircle() {
        System.out.println("This is circular shape");
    }
}

class SquareShape extends RectangleShape {
    public void printSquare() {
        System.out.println("Square is a rectangle");
    }
}

public class ShapeHierarchyDemo {
    public static void main(String[] args) {
        SquareShape square = new SquareShape();

        // Calling method of 'Shape' class using object of 'Square' class
        square.printShape();

        // Calling method of 'Rectangle' class using object of 'Square' class
        square.printRectangle();
    }
}