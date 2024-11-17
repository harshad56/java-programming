
public class File {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(45.7);
        cylinder.seHeight(100.8);
        System.out.println(cylinder.getRadius());
        System.out.println(cylinder.geHeight());

        cylinder.surfaceofcylinder();
        cylinder.volumofcylinder();
    }
}
