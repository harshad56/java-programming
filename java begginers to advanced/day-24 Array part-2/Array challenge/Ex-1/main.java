import java.util.Arrays;
import java.util.Random;

public class main {
    public static void main(String[] args) {

        int[] arrayvalue = getSorted(5);
        // ascending order
        Arrays.sort(arrayvalue);
        System.out.println(Arrays.toString(arrayvalue));

        // descending order
        for (int i = arrayvalue.length - 1; i > 0; i--) {
            System.out.println(arrayvalue[i]);
        }
    }

    // _------------------------------------------------
    public static int[] getSorted(int len) {
        Random random = new Random();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            //to print random number in array
            array[i] = random.nextInt(100);
        }

        return array;
    }
}
