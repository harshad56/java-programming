
public class SumOf1stand2nddigit {
    public static void main(String[] args) {
        System.out.println("sum of 1 st and last digit number:" + SumOf1and2Digit(123));
    }

    public static int SumOf1and2Digit(int number) {
        if (number < 0) {
            return -1;
        }

        int last_digit = number % 10;

        while (number >= 10) {
            number = number / 10;

        }

        int first_digit = number;
        return first_digit + last_digit;
    }
}
