import java.util.Scanner;

public class BarkingDog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time when dog barking: ");
        int hour_at_day = sc.nextInt();

        boolean time = Shouldwakeup(true, hour_at_day);
        if (time == true) {
            System.out.println("dog is barking");

        } else if (time == false) {
            System.out.println("dog is not barking");
        }

    }

    public static boolean Shouldwakeup(boolean barking, int hour_at_day) {

        if (hour_at_day < 0 || hour_at_day > 23) {
            return false;
        }

        return barking == true && (hour_at_day < 8 || hour_at_day > 22);

    }

}
