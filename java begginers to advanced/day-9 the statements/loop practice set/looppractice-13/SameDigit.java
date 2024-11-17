
public class SameDigit {
    public static void main(String[] args) {
        System.out.println("sameDigitChecker of given numbers:" + sameDigitChecker(14, 22));
    }

    public static boolean sameDigitChecker(int num1, int num2) {
        if (num1 > 99 || num2 > 99 && num1 <= 0 || num2 <= 0) {
            return false;
        }

        /*----------------------------------------------------- */
        int last_digit_ofNum1 = num1 % 10;
        int last_digit_ofNum2 = num2 % 10;
        /*----------------------------------------------------- */
        while (num1 > 10) {
            num1 = num1 / 10;
        }

        int first_digit_ofNum1 = num1;

        /*----------------------------------------------------- */
        while (num2 > 10) {
            num2 = num2 / 10;
        }

        int first_digit_ofNum2 = num2;

        /*----------------------------------------------------- */

        if (first_digit_ofNum2 == first_digit_ofNum1 || first_digit_ofNum2 == last_digit_ofNum1
                || last_digit_ofNum2 == first_digit_ofNum1 || last_digit_ofNum2 == last_digit_ofNum1) {
            return true;
        }

        else {
            return false;
        }
    }
}
