
public class Array7 {
    public static void main(String[] args) {
        int[] marks = { 10, 56, 678, 45, 907 };

        int max = 0;
        for (int element : marks) {
            if (max < element) {
                max = element;
            }

        }
        System.out.println(max);

    }
}
