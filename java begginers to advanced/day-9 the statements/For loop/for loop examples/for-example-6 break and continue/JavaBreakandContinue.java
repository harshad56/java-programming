
public class JavaBreakandContinue {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; i < 100; i++) {
            if (isDivide(i)) {
                if (i == 20) {
                    System.out.println("here is 20 we jump to next number using continue");
                    continue;
                }
                System.out.println("numbers are divide to 10 is: " + i);
                count++;

            } else {
                System.out.println("numbers are not to divide 10 is: " + i);
            }
        }
        System.out.println("count:" + count);
    }

    public static boolean isDivide(int number) {
        if (number % 10 == 0) {
            return true;
        } else {
            return false;
        }

    }
}
