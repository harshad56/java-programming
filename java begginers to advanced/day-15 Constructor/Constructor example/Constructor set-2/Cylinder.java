
public class Cylinder {
    // it instance varaible,decalring the instance vairable static keyword not used
    // methods
    private double radius;
    private double height;

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

    // it instance method
    public void surfaceofcylinder() {
        double surfaceArea = 2 * 3.14 * radius * (height * radius);
        System.out.println("surface of cylinder is:" + surfaceArea);
    }

    // it instance method
    public void volumofcylinder() {
        double volumecylinder = 3.14 * radius * radius * height;
        System.out.println("volumo f cylinder is:" + volumecylinder);
    }
}
