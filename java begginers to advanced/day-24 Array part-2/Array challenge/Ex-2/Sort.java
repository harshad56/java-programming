import java.util.Scanner;

public class Sort {
    int[] arr;
    int i;

    public void getintergers(int len) {
        Scanner sc = new Scanner(System.in);
        arr = new int[len];
        for (i = 0; i < len; i++) {
            System.out.println("Enter the " + (i + 1) + " number:");
            int value = sc.nextInt();
            arr[i] = value;
        }
    }

    public int[] getarray() {
        return arr;
    }

    public int[] printarray() {
        int temp;
        boolean flag = true;

        while (flag) {
            flag = false;
            for (i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return arr;
    }
}
