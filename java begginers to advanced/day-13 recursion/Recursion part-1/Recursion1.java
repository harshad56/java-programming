
public class Recursion1 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            // it is recursion method means calling method in itself.
            return n * factorial(n - 1);
        }
        // you can do with iteritive method
        // else{
        // int product=1
        // for(int i=1;i<=n;i++){
        // product *= i;
        // }
        // return product;
        // }
    }
}
