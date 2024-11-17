import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a float value:");
        String input = sc.nextLine();
        try {

            float value = Float.parseFloat(input);

            float[] marks = { 1.3f, 2.4f, 5.7f, 5.6f };

            boolean isArray = false;
            for (float element : marks) {
                if (value == element) {
                    isArray = true;
                    break;
                }
            }

            if (isArray == true) {
                System.out.println("it is similar");
            } else {
                System.out.println("it not simiilar");
            }

        } catch (NumberFormatException e) {
            System.out.println("write proper flaot value");
        }
        sc.close();

    }
}
