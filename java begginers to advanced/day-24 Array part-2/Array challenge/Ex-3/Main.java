import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getArrayMin g = new getArrayMin();
        // storedata
        g.storearraydata();

        // displayarray
        int[] array = g.displayarray();
        System.out.println(Arrays.toString(array));

        // minvalue
        g.getarraymin();
    }
}

class getArrayMin {
    int[] array;

    public void storearraydata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many name add in array: ");
        int n = sc.nextInt();
        array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter no %d: ", i + 1);
            int no = sc.nextInt();
            array[i] = no;

        }

    }

    public int[] displayarray() {
        return array;
    }

    public void getarraymin() {
        int min = Integer.MAX_VALUE;
        for (int element : array) {
            if (min > element) {
                min = element;
            }

        }
        System.out.println(min);

    }

}
