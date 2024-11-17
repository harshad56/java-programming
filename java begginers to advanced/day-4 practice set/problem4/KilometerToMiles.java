import java.util.Scanner;

public class KilometerToMiles {
    public static void main(String[] args) {
        System.out.println("user input");
        Scanner sc = new Scanner(System.in);
        System.out.print("write a kilometer value in km to convert into miles:");
        float km = sc.nextFloat();
        float milesconvertor = km * 0.62137119f;
        System.out.println("miles is:" + milesconvertor + " miles");
        
        sc.close();//this line write only to disable yellow line on sc there is no use in code bythe way
    }
}
