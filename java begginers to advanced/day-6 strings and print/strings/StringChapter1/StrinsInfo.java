import java.util.Scanner;

public class StrinsInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the string");
        // String str = sc.next();// it gives one word in line input
        System.out.println("Enter the string");
        String str1 = sc.nextLine();// it gives complete input line

        // System.out.println(str);
        System.out.println(str1);

        sc.close();
    }
}
