
public class printnumbers {
    public static void main(String[] args) {
        int number = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }

        // for reverse order
        int numberreverse = 15;
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(numberreverse + " ");
                numberreverse--;
            }
            System.out.println();
        }
    }

}
