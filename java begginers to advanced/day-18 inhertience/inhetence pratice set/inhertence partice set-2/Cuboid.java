
public class Cuboid extends Rectangel {
    private double Height;

    public Cuboid(double w, double l, double height) {
        super(w, l);
        Height = height;
    }

    public double getHeight() {
        if (Height < 0) {
            return 0;
        }
        return Height;
    }

    public double volume() {
        return super.getarea() * Height;
    }

}
