import java.util.Scanner;

public class AreaCalculalter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*--------------------Area of circle input----------------------- */
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        System.out.println("Area of circle is:" + AreaofCalculate(radius));

        /*---------------------Area of rectangle input-------------------------- */
        System.out.println("write height value of rectangle: ");
        int height = sc.nextInt();
        System.out.println("write width value of rectangle:");
        int width = sc.nextInt();
        System.out.println("Area of rectangle is:" + AreaofCalculate(height, width));

        sc.close();
    }

    public static double AreaofCalculate(double radius) {
        return 3.14 * radius * radius;
    }

    public static int AreaofCalculate(int height, int width) {
        return height * width;

    }
}