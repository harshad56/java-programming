import java.util.Scanner;

public class CgpaCalcultor {
    public static void main(String[] args) {
        System.out.println("write subject score");
        Scanner sc = new Scanner(System.in);
        System.out.print("write subject score of hindi:");
        float hindi = sc.nextFloat();
        System.out.print("write subject score of Biology:");
        float Biology = sc.nextFloat();
        System.out.print("write subject score of tamil:");
        float tamil = sc.nextFloat();

        float cgpa = (hindi + Biology + tamil) / 30;
        System.out.println("the total cgpa is:" + cgpa);

        sc.close();//this line write only to disable yellow line on sc there is no use in code bythe way
    }
}
