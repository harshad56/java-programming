
public class Printfactors {
    public static void main(String[] args) {
        NumbersDivder(12);
    }

    public static int NumbersDivder(int number) {

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                System.out.println(i);
            }

        }
        return 0;

    }
}
