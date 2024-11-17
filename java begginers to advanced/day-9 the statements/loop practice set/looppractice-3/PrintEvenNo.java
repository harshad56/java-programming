import java.util.Scanner;

public class PrintEvenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no to print even no upto: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int no = i + i;
            sum += no;
        }
        System.out.println(sum);
    }

}
