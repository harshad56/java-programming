
public class Cylinder {
    private double radius;// it instance varaible,decalring the instance vairable static keyword not used
                          // methods
    private double height;// it instance varaible

    public Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    // it instance method
    public void setRadius(double r) {
        radius = r;
    }

    // it instance method
    public double getRadius() {
        return radius;
    }

    // it instance method
    public void seHeight(double h) {
        height = h;
    }

    // it instance method
    public double geHeight() {
        return height;
    }

    public void surfaceofcylinder() {
        double surfaceArea = 2 * 3.14 * radius * (height * radius);
        System.out.format("surface of cylinder is %.2f:", surfaceArea);
    }

    public void volumofcylinder() {
        double volumecylinder = 3.14 * radius * radius * height;
        System.out.format("volumo f cylinder is %.2f:", volumecylinder);
    }
}
