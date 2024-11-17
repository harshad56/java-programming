import java.util.Scanner;

public class CheckEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number:");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number:");
        int num3 = sc.nextInt();
        Equaltiyofnumbers(num1, num2, num3);
        sc.close();

    }

    public static void Equaltiyofnumbers(int num1, int num2, int num3) {
        if (num1 == num2 && num2 == num3 && num3 == num1) {
            System.out.println("All three numbers are equal");
        }

        else if (num1 != num2 && num2 != num3 && num3 != num1) {
            System.out.println("All three numbers are different");
        }

        else if (num1 == num2 || num2 != num3 || num3 != num1 && num1 != num2 || num2 == num3
                || num3 != num1 && num1 != num2 || num2 != num3 || num3 == num1) {
            System.out.println("All three numbers are different or equal");
        }

    }
}
