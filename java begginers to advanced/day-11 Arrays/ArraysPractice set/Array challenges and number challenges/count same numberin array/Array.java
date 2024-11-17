import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Inputforarray i = new Inputforarray();
        i.input();
        i.displayarray();
        i.Findcountsame();
    }
}

class Inputforarray {
    int num;
    int[] arraysize;
    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("How many numbers do you want to add in the array?");
        int totalnum = sc.nextInt();
        arraysize = new int[totalnum];

        for (int i = 0; i < totalnum; i++) {
            System.out.printf("Enter %d number: ", i + 1);
            num = sc.nextInt();
            arraysize[i] = num;
        }
    }

    public void displayarray() {
        for (int elements : arraysize) {
            System.out.print(elements + " ");
        }
    }

    public void Findcountsame() {
        int count = 0;
        for (int i = 0; i < arraysize.length; i++) {

            for (int j = 0; j < arraysize.length; j++) {
                if (arraysize[i] == arraysize[j]) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println("Element " + arraysize[i] + " appears " + count + " times.");
            }
        }
    }
}