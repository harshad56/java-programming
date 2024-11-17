
public class Array9 {
    public static void main(String[] args) {
        // check sorted or not means it number is in ascending order or not
        int[] array = { 1, 2, 3, 4, 5, 56, 67 };

        boolean isSorted = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("it is a sorted array");
        } else {
            System.out.println("it is not a sorted array");
        }
    }
}
