import java.util.Scanner;

public class Conditionl {
    public static void main(String[] args) {
        int age = 18;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a your age to check you are eligble for voiting or not in school(age18to25):");
        int userinput = sc.nextInt();

        if (userinput >= age && userinput <= 25) {
            System.out.println("your are eliglble for school voiting");

        }

        /*----------------------------------------------------------------- */
        else if (userinput >= 26) {

            System.out.println("you are not eligble for voiting");
        }

        /*----------------------------------------------------------------- */
        else if (userinput >= 1 || userinput <= 17) {
            System.out.println("you are minor");

        }

        sc.close();
    }
}
