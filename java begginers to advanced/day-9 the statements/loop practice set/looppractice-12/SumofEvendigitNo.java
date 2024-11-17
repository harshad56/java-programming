
public class SumofEvendigitNo {
    public static void main(String[] args) {
        System.out.println("addition of even digit sum:" + evendigitSum(123456));
    }

    public static int evendigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {

            int value = number % 10;
            if (value % 2 == 0) {
                sum += value;
            }
            number = number / 10;
        }
        return sum;

    }
}
