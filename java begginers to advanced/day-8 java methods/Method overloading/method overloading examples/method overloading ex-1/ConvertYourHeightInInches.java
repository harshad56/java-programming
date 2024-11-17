import java.util.Scanner;

public class ConvertYourHeightInInches {
    public static void main(String[] args) {
        double height_Into_Cm = ConvertToCentimetres();// call method 1
        System.out.println("Your height in centimeters is: " + height_Into_Cm);
    }

    // method1
    public static double ConvertToCentimetres() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your height in feet only:");
        int heightInFeet = sc.nextInt();
        System.out.print("Enter your remaining height in inches:");
        int Remaining_Inches = sc.nextInt();
        sc.close();
        double value = ConvertToCentimetres(heightInFeet, Remaining_Inches);// her we call method2
        return value * 2.54;

    }

    // method2
    public static double ConvertToCentimetres(int heightInFeet, int Remaining_Inches) {
        int conert_toinches = heightInFeet * 12;// multiply by 12
        int totalInches = conert_toinches + Remaining_Inches;// plus remining inches
        return totalInches;

    }

    /*
     * you can do like this also
     * // method1
     * public static double ConvertToCentimetres(int inches ) {
     * return inches*2.54;
     * }
     * // method2
     * public static double ConvertToCentimetres(int heightInFeet, int inches){
     * return ConvertToCentimetres((feet*12)+inches);//here we call method1
     * }
     */
}
