public class Circle {
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    public double diameter() {
        return 2 * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumfrence() {
        return 2 * Math.PI * radius;
    }
}
