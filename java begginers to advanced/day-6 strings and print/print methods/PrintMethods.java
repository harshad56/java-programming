
public class PrintMethods {
    public static void main(String[] args) {
        String name = "harshad";
        /*--------------------------------------------------------------- */

        System.out.println("name is:" + name); // 1)println
        /*--------------------------------------------------------------- */

        System.out.print("name is:" + name); // 2)print
        /*--------------------------------------------------------------- */
        System.out.println("");

        // new print method for format //3)printf
        // format specfier
        int a = 56;
        float b = 45.67778f;
        /*--------------------------------------------------------------- */
        System.out.printf("the value of a is %d and value of b is %f", a, b);
        // here %d is for int no and %f is for float no ,%c for char,%s for string
        System.out.println();
        System.out.printf("the value of a is %d and value of b is %.2f", a, b);
        // you can also do this to round of or decreases decimals by%.2f in float or
        // double
        /*--------------------------------------------------------------- */
    }

}
