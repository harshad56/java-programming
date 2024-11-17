import java.util.Scanner;

public class JavaMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("write outof marks one sub:");
        int out_of = sc.nextInt();

        System.out.print("write  marks one sub1:");
        int sub1 = sc.nextInt();

        System.out.print("write marks one sub2:");
        int sub2 = sc.nextInt();

        System.out.print("write  marks one sub3:");
        int sub3 = sc.nextInt();

        calculation(sub1, sub2, sub3, out_of);
        sc.close();
    }

    public static void calculation(int sub1, int sub2, int sub3, int out_of) {
        // Calculation is done here
        float total = sub1 + sub2 + sub3;
        float out_of_marks = out_of * 3;

        float percentage = (total / out_of_marks) * 100;

        if (percentage >= 40.0) {
            System.out.println("your are pass");
        }

        else if (percentage <= 39.0 && percentage >= 1.0) {
            System.out.println("you are fial");
        }

        else {
            System.out.println("some mistake");
        }
    }

}
