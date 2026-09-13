class Rectangle {
    double length;
    double breadth;

    // Constructor taking length and breadth as parameters
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method returning the area
    public double area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 5);
        Rectangle rect2 = new Rectangle(5, 8);

        System.out.println("Area of Rectangle 1 (4x5): " + rect1.area());
        System.out.println("Area of Rectangle 2 (5x8): " + rect2.area());
    }
}