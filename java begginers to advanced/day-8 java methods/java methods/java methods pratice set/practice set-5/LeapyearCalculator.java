import java.util.Scanner;

public class LeapyearCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a year to check it is leap year or not:");
        int year = sc.nextInt();

        boolean answer = LeapYearorNot(year);
        if (answer == true) {
            System.out.println("it is leap year");
        } else {
            System.out.println("it is not leap year");
        }
    }

    public static boolean LeapYearorNot(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
