
import java.util.Arrays;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        arrarreverse arr = new arrarreverse();
        arr.getarray(3);
        arr.display();
        // arr.reversearray();
        arr.reversearraywithswaping();

    }
}

class arrarreverse {

    int[] array;

    void getarray(int len) {
        Scanner sc = new Scanner(System.in);
        array = new int[len];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("enter %d number: ", i + 1);
            int no = sc.nextInt();
            array[i] = no;
        }
    }

    void display() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // void reversearray() {
    // System.out.println();
    // for (int i = array.length - 1; i >= 0; i--) {
    // System.out.println(array[i]);
    // }
    // }

    // other method when swapping is asked
    void reversearraywithswaping() {
        int start = 0;
        int end = array.length - 1;
        while (end > start) {

            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;

        }
        System.out.println(Arrays.toString(array));
    }
}
