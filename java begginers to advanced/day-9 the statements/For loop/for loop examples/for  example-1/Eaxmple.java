import java.util.Scanner;

public class Eaxmple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers n odd numbers");
        int n = sc.nextInt();// it print first n odd no
        for (int i = 0; i <= n; i++) {
            // here print then increment 0+1=1,2,,3,4,5 so
            System.out.println(2 * i + 1);// here goes i=1,2,3,4,5
                                          // so is ans=1,3,5,7,9,11
        }

        for (int s = 1; s <= n; s++) {
            System.out.println(2 * s);// for sum numbers it print first n sum numbers
        }
    }
}
