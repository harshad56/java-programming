
public class Array6 {
    public static void main(String[] args) {
        int[] marks = { 10, 9, 678, 45, 907 };

        int min = Integer.MAX_VALUE;

        for (int element : marks) {
            if (min > element) {
                min = element;
            }

        }

        System.out.println(min);

    }
}
