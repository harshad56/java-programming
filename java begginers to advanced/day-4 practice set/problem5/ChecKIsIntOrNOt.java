import java.util.Scanner;

public class ChecKIsIntOrNOt {
    public static void main(String[] args) {
        System.out.println("user input");
        Scanner sc = new Scanner(System.in);
        System.out.print("write a  to check is a intger:");
        Boolean check = sc.hasNextInt();// boolean is check is int or not by hasnextIn() method

        System.out.println("answer:" + check);

        sc.close();

    }
}
