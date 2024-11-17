import java.util.Scanner;

public class UserInputUserName {
    public static void main(String[] args) {
        System.out.println("user input");
        Scanner sc = new Scanner(System.in);
        System.out.print("write your name:");
        String name = sc.nextLine();// for string you can write next()or nextLine()
        System.out.println("hello " + name + " have a good day");

        sc.close();//this line write only to disable yellow line on sc there is no use in code bythe way
    }
}
