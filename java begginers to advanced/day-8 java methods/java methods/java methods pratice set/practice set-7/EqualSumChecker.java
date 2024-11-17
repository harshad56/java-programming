import java.util.Scanner;

public class EqualSumChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number 1:");
        int number1 = sc.nextInt();
        System.out.print("enter number 2:");
        int number2 = sc.nextInt();
        System.out.print("enter number 3:");
        int number3 = sc.nextInt();
        boolean result = hasequalchecker(number1, number2, number3);
        if (result == true) {
            System.out.println("num1 and num2 is equal to num3");
        } else {
            System.out.println("num1 and num2 is not equal to num3");
        }
    }

    public static boolean hasequalchecker(int number1, int number2, int number3) {
        if (number1 + number2 == number3) {
            return true;
        } else {
            return false;
        }
    }

}
