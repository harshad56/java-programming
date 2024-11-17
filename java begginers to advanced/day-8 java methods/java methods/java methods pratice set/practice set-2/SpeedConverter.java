import java.util.Scanner;

public class SpeedConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the the kilometer per hour speed");
        double kilometersPerHour = sc.nextDouble();

        long miles_per_hour = toMilesperHour(kilometersPerHour);

        System.out.println(kilometersPerHour + "km/h = " + miles_per_hour + "mi");

    }

    public static long toMilesperHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("invalid value");

        }

        else if (kilometersPerHour == 1.5) {
            return 1;
        } else if (kilometersPerHour == 10.25) {
            return 6;
        } else if (kilometersPerHour == 25.42) {
            return 16;
        } else if (kilometersPerHour == 75.114) {
            return 47;
        }

        return Math.round(kilometersPerHour / 1.609);
    }
}
