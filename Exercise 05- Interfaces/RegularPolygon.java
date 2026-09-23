public interface RegularPolygon {
    // Abstract methods
    int getNumSides();
    double getSideLength();

    // Static method: Sums total sides from an array of RegularPolygons
    static int totalSides(RegularPolygon[] polygons) {
        int total = 0;
        if (polygons != null) {
            for (RegularPolygon polygon : polygons) {
                if (polygon != null) {
                    total += polygon.getNumSides();
                }
            }
        }
        return total;
    }

    // Default method: Perimeter calculation (n * length)
    default double getPerimeter() {
        return getNumSides() * getSideLength();
    }

    // Default method: Interior angle calculation in radians ((n - 2) * PI / n)
    default double getInteriorAngle() {
        int n = getNumSides();
        return ((n - 2.0) * Math.PI) / n;
    }
}