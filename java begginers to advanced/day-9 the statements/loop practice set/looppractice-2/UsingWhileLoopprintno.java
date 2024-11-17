import java.util.Scanner;

public class UsingWhileLoopprintno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no to print even no upto: ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= n) {
            System.out.println(i);
            i++;

            sum += i;

        }
        System.out.println(sum);
    }

}
