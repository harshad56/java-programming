import java.util.Scanner;

public class CheckNoGreaterOrNOt {
    public static void main(String[] args) {
        int given_no = 56;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number TO check your is greather given number:");

        int user_number = sc.nextInt();

        if (user_number > given_no) {
            System.out.printf("The user_number %d is greather than given_no %d", user_number, given_no);
            /*
             * her use printf format printing method
             * // here %d is for int no and %f is for float no ,%c for char,%s for string
             * same format like upper one
             */
        }

        else {
            System.out.printf("The user_number %d is less than given_no %d", user_number, given_no);
        }

        sc.close();
    }
}
