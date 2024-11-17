
public class Chapter1 {
    public static void main(String[] args) {
        String name = "harshad";
        System.out.println("name is:" + name); // 1)println
        System.out.print("name is:" + name); // 2)print
        System.out.println("");

        // new print method for format //3)printf
        // format specfier
        int a = 56;
        float b = 45;
        System.out.printf("the value of a is %d and value of b is %f", a, b);
        // here %d is for int no and %f is for float no ,%c for char,%s for string
    }

}
