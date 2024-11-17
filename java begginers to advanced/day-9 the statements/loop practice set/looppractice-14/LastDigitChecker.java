
public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println("numbers has have same digits or not:" + lastDigitChecker(12, 23, 22));
    }

    public static boolean lastDigitChecker(int num1, int num2, int num3) {

        if (num1 > 99 || num2 > 99 || num3 > 99 && num1 < 0 || num2 < 0 || num3 < 0) {
            return false;
        }

        /*----------------------------------------------------- */
        int last_digit_ofNum1 = num1 % 10;
        int last_digit_ofNum2 = num2 % 10;
        int last_digit_ofNum3 = num3 % 10;

        if (last_digit_ofNum1 == last_digit_ofNum2 || last_digit_ofNum1 == last_digit_ofNum3
                || last_digit_ofNum2 == last_digit_ofNum3) {
            return true;
        }

        else {
            return false;
        }
    }
}
