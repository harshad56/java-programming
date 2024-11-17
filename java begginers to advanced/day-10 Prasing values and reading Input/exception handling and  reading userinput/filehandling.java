import java.util.Scanner;

public class filehandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student = 1;
        int sum = 0;
        while (student <= 5) {

            System.out.println("Enter your number" + student + ":");
            // 2)
            String number = sc.nextLine();

            try {
                int num = Integer.parseInt(number);
                student++;
                sum += num;
            } catch (NumberFormatException nfe) {
                System.out.println("invalid number");
            }

        }

        System.out.println("sum of all 5 numbers are:" + sum);
        sc.close();
    }

}
