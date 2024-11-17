
public class Area {
    private double Height;
    private double Width;

    public Area(double height, double width) {
        Height = height;
        Width = width;
    }

    public double getHeight() {
        if (Height < 0) {
            Height = 0;
        }
        return Height;

    }

    public double getWidth() {
        return Width;
    }

    public double getArea() {
        return Height * Width;
    }

}
