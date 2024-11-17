import java.util.Scanner;

public class SwitchBlock {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a your age to check you are gymrat or not(age18to90):");
        // here check int but you check char,string,float value aslo also
        // example1
        int userage = sc.nextInt();

        switch (userage) {
            case 18:
                System.out.println("you are begginer");
                break;

            case 20:
                System.out.println("you are gymbuddy");
                break;

            case 25:
                System.out.println("you are gymshark");
                break;

            case 45:
                System.out.println("you are ghost");
                break;

            default:
                System.out.println("you are amazing");

        }

        sc.close();
    }

}
