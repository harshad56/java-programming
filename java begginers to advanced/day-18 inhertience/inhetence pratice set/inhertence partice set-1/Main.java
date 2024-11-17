
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.17);
        System.out.println("radius of circle" + circle.getradius());
        System.out.println("Area of Circle" + circle.getArea());

        Cylinder cylinder = new Cylinder(2.16, 5.8);
        System.out.println("cylinder.radius= " + cylinder.getradius());
        System.out.println("cylinder.height= " + cylinder.getheight());
        System.out.printf("cylinder.area= %.3f %n ", cylinder.getArea());
        // %n for next line inprintf
        System.out.printf("cylinder.volume= %.3f ", cylinder.getvolume());
    }
}
