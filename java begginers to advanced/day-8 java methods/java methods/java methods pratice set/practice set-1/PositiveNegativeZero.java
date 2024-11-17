import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt();
        CheckNumber(number);
        sc.close();
    }

    public static void CheckNumber(int number) {
        if (number > 0) {
            System.out.println("it is positive no");
        } else if (number < 0) {
            System.out.println("it is negative no");
        }

        else {
            System.out.println("it is zero");
        }
    }
}
