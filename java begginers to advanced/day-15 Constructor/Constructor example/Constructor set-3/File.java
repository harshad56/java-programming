
public class File {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(23, 56);

        System.out.println(cylinder.getRadius());
        System.out.println(cylinder.geHeight());

        cylinder.surfaceofcylinder();
        cylinder.volumofcylinder();
    }
}
