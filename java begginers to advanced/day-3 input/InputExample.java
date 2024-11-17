import java.util.Scanner;

public class InputExample {

    public static void main(String[] args) {

        System.out.println("Taking a user input");
        Scanner sc = new Scanner(System.in);// System.in means taking input from keyboard
        System.out.print("Enter a number 1:");
        int a = sc.nextInt();
        System.out.print("Enter a number 2:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("answer of sum od two numbers:" + sum);

        // to check user input number is int or not
        // boolean b1 = sc.hasNextInt();
        // System.out.print(b1);

        sc.close();// this line write only to disable yellow line on sc there is no use in code
                   // bythe way
    }

}
