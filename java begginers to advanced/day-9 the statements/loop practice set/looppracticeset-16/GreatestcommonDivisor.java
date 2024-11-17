
public class GreatestcommonDivisor {
    public static void main(String[] args) {
        System.out.println(NumbersDivder(12, 30));
    }

    public static int NumbersDivder(int number1, int number2) {
        int value1 = 0;
        for (int i = 1; i <= 100; i++) {

            if (number1 % i == 0 && number2 % i == 0) {
                value1 = i;
            }

        }
        return value1;
    }
}