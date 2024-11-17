import java.util.Scanner;

public class MinutesToYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        long minutes = scanner.nextLong();
        PrintYearandDays(minutes);
        scanner.close();

    }

    public static void PrintYearandDays(long minutes) {
        long days = minutes / 1440;
        long years = minutes / 525600;
        System.out.println(minutes + " minutes= " + years + " Years " + days + " days");
    }

}
