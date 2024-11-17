import java.util.Scanner;

public class InputCalcultor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number how many you wnat sum: ");
        String number = sc.nextLine();
        int num = Integer.parseInt(number);

        double sum = 0;
        int value = 1;
        int count = 0;

        while (value <= num) {
            System.out.println("enter a number#" + value);
            String input = sc.nextLine();
            try {
                double inputNum = Double.parseDouble(input);
                sum += inputNum;

                value++;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("invalid");
            }
        }

        inputThenPrintSumAndAverage(sum, count);
        sc.close();
    }

    public static void inputThenPrintSumAndAverage(double sum, int count) {
        long averge = Math.round(sum) / count;
        System.out.println("the sum of numbers:" + (int) (sum) + ",the average is:" + averge);
    }
}
