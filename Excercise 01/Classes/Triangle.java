class Triangle {
    double a, b, c;

    // Constructor with 3 sides as parameters
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        double s = getPerimeter() / 2.0; // Semi-perimeter
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Heron's Formula
    }

    public static void main(String[] args) {
        Triangle t = new Triangle(3, 4, 5);
        System.out.println("Perimeter of Triangle: " + t.getPerimeter() + " units");
        System.out.println("Area of Triangle: " + t.getArea() + " sq units");
    }
}