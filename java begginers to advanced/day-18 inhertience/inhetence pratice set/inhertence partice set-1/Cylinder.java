
public class Cylinder extends Circle {
    private double height;

    public Cylinder(double r, double h) {
        super(r);
        height = h;
    }

    public double getheight() {
        if (height < 0) {
            return 0;
        } else {
            return height;
        }
    }

    public double getvolume() {
        return super.getArea() * height;
    }
}
