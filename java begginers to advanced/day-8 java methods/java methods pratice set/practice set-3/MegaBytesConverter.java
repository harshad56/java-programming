import java.util.Scanner;

public class MegaBytesConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of kilobytes: ");
        int kb = sc.nextInt();
        megaBytesConverter(kb);
    }

    public static void megaBytesConverter(int kb) {
        int mb = kb / 1024; // division value on upperside of division

        int remaining_value_inkb = kb % 1024;// remainder is remaining_value_inkb
        System.out.printf("kb value is %d = %dMB and %dKB", kb, mb, remaining_value_inkb);
    }
}
