import java.util.Scanner;

public class SystemConcole {
    public static void main(String[] args) {
        int currentYear = 2024;

        try {
            System.out.println(GetCurrentYearFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(GetCurrentYearFromScanner(currentYear));
        }
    }

    // here we see differenve getting input from user using scanner or console
    // console method work in vs code but intlelji not supported so to run in
    // intleli thier are command (java src/filename.java) in terminal of intlelji

    public static String GetCurrentYearFromConsole(int currentYear) {
        // ex-1
        String name = System.console().readLine("hi,what is your name:");
        System.out.println("Hi " + name + ",thanks for taking the course");

        /*-------------------------------------------------------------------------- */
        // ex-2
        boolean validdob = false;
        int age = 0;

        do {
            System.out.println("enter your birth>= :" + (currentYear - 125) + " and<= " + currentYear);
            try {
                age = checkdata(currentYear, System.console().readLine());
                validdob = age < 0 ? false : true;
            } catch (NumberFormatException baduserdata) {
                System.out.println("charcters a not allowed");
            }

        } while (!validdob);
        return ("hi " + age + " it is your age ");

    }

    /*-------------------------------------------------------------------------- */
    public static String GetCurrentYearFromScanner(int currentYear) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what is  your name:");
        String name = sc.nextLine();
        System.out.println("Hi " + name + ",thanks for taking the course");

        // ex-2
        boolean validdob = false;
        int age = 0;

        do {
            System.out.println("enter your birth>= :" + (currentYear - 125) + " and<= " + currentYear);
            try {
                age = checkdata(currentYear, sc.nextLine());
                validdob = age < 0 ? false : true;
            } catch (NumberFormatException baduserdata) {
                System.out.println("charcters a not allowed");
            }

        } while (!validdob);
        sc.close();
        return ("hi " + age + " it is your age ");

    }

    /*-------------------------------------------------------------------------- */
    public static int checkdata(int currentYear, String YourBirthdateYear) {
        /*
         * so here value from input its
         * no but it is in string like this"12"
         * so it is nned to convert to int
         */
        int Birthyear = Integer.parseInt(YourBirthdateYear);
        int minyear_of_yera = currentYear - 125;

        if ((Birthyear >= minyear_of_yera) || Birthyear >= currentYear) {
            return -1;
        }
        return (currentYear - Birthyear);
    }
}
