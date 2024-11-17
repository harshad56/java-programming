import java.util.Scanner;

public class Teen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a age of teen1(13to19): ");
        int ageofteen1 = input.nextInt();
        System.out.print("Enter a age of teen2(13to19): ");
        int ageofteen2 = input.nextInt();
        System.out.print("Enter a age of teen3(13to19):");
        int ageofteen3 = input.nextInt();
        boolean age = Teenchecker(ageofteen1, ageofteen2, ageofteen3);
        System.out.println("to check one of the teen(13 to19 age):" + age);

    }

    public static boolean Teenchecker(int ageofteen1, int ageofteen2, int ageofteen3) {
        if (ageofteen1 >= 13 && ageofteen1 <= 19 || ageofteen2 >= 13 && ageofteen2 <= 19
                || ageofteen3 >= 13 && ageofteen3 <= 19) {
            return true;

        }

        else {
            return false;
        }

    }
}
