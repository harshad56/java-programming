import java.util.Scanner;

public class SwitchBlock2 {
    public static void main(String[] args) {
        // example1
        // here check char but you check int,string,float value aslo also
        char ch = 'c';
        switch (ch) {
            case 'a':
                System.out.println("it is a 'a'");
                break;

            case 'b':
                System.out.println("it is a 'b'");
                break;

            case 'c':
                System.out.println("it is a 'c'");
                break;

            default:
                System.out.println("it is not'a,b,c'");
        }

        /*--------------------------------------------------------- */
        // example2
        Scanner sc = new Scanner(System.in);
        System.out.print("write your name:");
        String var = sc.next();

        switch (var.toLowerCase()) {
            case "aarav":
                System.out.println("it is a 'aarav'");
                break;

            case "barav":
                System.out.println("it is a 'barav'");
                break;

            case "harshad":
                System.out.println("it is a 'harshad'");
                break;

            default:
                System.out.println("it is not'aarav,barav,harshad'");
        }

        sc.close();

    }
}
