
public class Sum3And5Callenge {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {

            if (isDivide(i)) {
                System.out.println(i);
                count++;
                sum += i;
                if (count == 5) {
                    break;
                }
            }
        }
        System.out.println("sum of 5 numbers are:" + sum);
    }

    public static boolean isDivide(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return true;
        }

        else {
            return false;
        }
    }
}
