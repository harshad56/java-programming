
public class Rectangel {
    private double Width;
    private double length;

    public Rectangel(double width, double length) {
        Width = width;
        this.length = length;
    }

    public double getWidth() {
        if (Width < 0) {
            return 0;
        }
        return Width;
    }

    public double getLength() {
        if (length < 0) {
            return 0;
        }
        return length;
    }

    public double getarea() {
        return length * Width;
    }

}
