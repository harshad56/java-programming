import java.util.Arrays;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        int[] firstarray = getRandomArray(10);
        // method1
        System.out.println(Arrays.toString(firstarray));
        /*--------------------------------------------------------- */
        // method2 :-Sort()
        Arrays.sort(firstarray);
        System.out.println(Arrays.toString(firstarray));
        /*--------------------------------------------------------- */
        // method3:-fill()
        int[] secondArray = new int[5];
        System.out.println(Arrays.toString(secondArray));

        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));
        /*--------------------------------------------------------- */
        // method4:-copyof()
        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fouthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fouthArray));
    }

    public static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
}
