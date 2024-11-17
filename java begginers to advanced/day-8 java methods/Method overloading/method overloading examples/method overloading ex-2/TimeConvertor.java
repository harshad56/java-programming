import java.util.Scanner;

public class TimeConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter time in seconds:");
        int seconds = sc.nextInt();
        int min = seconds / 60;

        System.out.println(getDurationSring(seconds, min));
        sc.close();
    }

    public static int getDurationSring(int seconds) {
        int hour = seconds / 3600;
        return hour;

    }

    public static String getDurationSring(int seconds, int min) {
        if (seconds >= 1) {
            int remaining_scenods = seconds % 60;
            int remaining_min = min % 60;
            int hour = getDurationSring(seconds);
            return hour + " hour " + remaining_min + " remaining_minutes " + remaining_scenods + " remaining_secnods";
        } else {
            return "Invalid input";
        }
    }
}
