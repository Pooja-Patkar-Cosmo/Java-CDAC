public class Main {
    public static void main(String[] args) {
        RegularPolygon triangle = new EquilateralTriangle(5.0);
        RegularPolygon square = new Square(4.0);

        RegularPolygon[] shapes = { triangle, square };

        // Test static method
        System.out.println("Total Sides: " + RegularPolygon.totalSides(shapes)); // Output: 7

        // Test default methods
        System.out.println("Triangle Perimeter: " + triangle.getPerimeter()); // Output: 15.0
        System.out.println("Triangle Interior Angle (rad): " + triangle.getInteriorAngle()); // Output: ~1.047

        System.out.println("Square Perimeter: " + square.getPerimeter()); // Output: 16.0
        System.out.println("Square Interior Angle (rad): " + square.getInteriorAngle()); // Output: ~1.5707
    }
}