
import java.util.Scanner;

public class ReplaceNamewithStringName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("write your name:");
        String name = sc.next();

        String line = "Hello <|Name|>,Thanks a lot!";
        System.out.println(line.replace("<|Name|>", name));// replace target word with string input name

        sc.close();
    }
}
