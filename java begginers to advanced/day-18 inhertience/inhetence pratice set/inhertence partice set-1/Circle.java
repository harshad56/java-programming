
public class Circle {
    private double radius;

    public Circle(double Radius) {
        radius = Radius;
    }

    public double getradius() {
        if (radius < 0) {
            return 0;
        } else {
            return radius;
        }
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
}
