
public class ParsingValue {
    public static void main(String[] args) {
        int currentYear = 2024;
        String YourBirthdateYear = "2003";
        // int example
        // it convert userinput is in the string then if its string convert to int
        int dateOfbirth = Integer.parseInt(YourBirthdateYear);

        System.out.println("age:" + (currentYear - dateOfbirth));

        // double example
        // it string to double
        // you can also conert string to float etc

        String userAgewithPartialYera = "22.5";
        double agewithPartialyera = Double.parseDouble(userAgewithPartialYera);
        System.out.println(agewithPartialyera);
    }
}
