import java.util.Scanner;

public class PercentageConvertot {
    public static void main(String[] args) {
        System.out.println("write score of your subject");
        Scanner sc = new Scanner(System.in);

        System.out.print("write score of your hindi:");
        int hindi = sc.nextInt();
        System.out.print("write score of your marathi:");

        int marathi = sc.nextInt();
        System.out.print("write score of your english:");
        int English = sc.nextInt();
        System.out.print("write score of your maths");
        int maths = sc.nextInt();
        System.out.print("write score of your science:");
        int science = sc.nextInt();

        int total = hindi + marathi + English + maths + science;
        float percentage = (float) total / 500 * 100;
        System.out.println("the percentage of your score" + percentage);
        System.out.println((int) total);// here we done type casting float to int

        sc.close();// this line write only to disable yellow line on sc there is no use in code
                   // bythe way

    }
}
