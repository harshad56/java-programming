
public class FindFactirialofno {
    public static void main(String[] args) {
        // using for loop
        int ans = 1;
        for (int i = 7; i >= 1; i--) {

            ans *= i;
        }
        System.out.println("using for loop factorial is:" + ans + "\n");

        // using while loop
        int ansusinwhile = 1;
        int i = 7;
        while (i >= 1) {
            ansusinwhile *= i;
            i--;
        }
        System.out.println("using while loop factorial is:" + ansusinwhile);
    }
}
