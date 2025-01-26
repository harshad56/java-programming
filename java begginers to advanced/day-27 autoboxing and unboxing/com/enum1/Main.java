
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        DayofTheWeek dayOfWeek = DayofTheWeek.TUE;
        System.out.println(dayOfWeek);
        for (int i = 0; i < 10; i++) {
            dayOfWeek = getRandomDay();
            System.out.printf("Name is %s,ordinal value is =%d%n", dayOfWeek.name(), dayOfWeek.ordinal());

            if (dayOfWeek == DayofTheWeek.FRI) {
                System.out.println("FOUND");
            }

        }

    }

    public static DayofTheWeek getRandomDay() {

        int randomInteger = new Random().nextInt(7);
        var alldays = DayofTheWeek.values();

        return alldays[randomInteger];

    }
}
