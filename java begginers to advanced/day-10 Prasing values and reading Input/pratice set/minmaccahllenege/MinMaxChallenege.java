import java.util.Scanner;

public class MinMaxChallenege {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double min = 0;
        double max = 0;
        int loopcount = 0;

        while (true) {
            System.out.println("Enter the number, or charcter to quit: ");
            String input = sc.nextLine();
            try {
                double validnum = Double.parseDouble(input);
                if (loopcount == 0 || validnum < min) {
                    min = validnum;
                }
                if (loopcount == 0 || validnum > max) {
                    max = validnum;
                }
                loopcount++;
            } catch (NumberFormatException e) {
                break;
            }
        }
        if (loopcount > 0) {
            System.out.println("the min:" + min + " ,the max:" + max);
        } else {
            System.out.println("no number input");
        }
    }
}
