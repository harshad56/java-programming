import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        linereSearch liner = new linereSearch();
        // storedata
        liner.storearraydata();

        // displayarray
        String[] array = liner.displayarray();
        System.out.println(Arrays.toString(array));

        // linersearch

        liner.lineresearch();

        // bineryserach
        binerySerach b = new binerySerach();
        b.binerys();
    }

}

class linereSearch {
    String[] array;

    public void storearraydata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many name add in array: ");
        int n = sc.nextInt();
        array = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter name %d: ", i + 1);
            String name = sc.next();
            array[i] = name;

        }

    }

    public String[] displayarray() {
        return array;
    }

    public void lineresearch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("targetd name:");
        String tag_name = sc.next();

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(tag_name)) {
                System.out.println("name found at index " + i);
            }
        }

    }
}

class binerySerach extends linereSearch {

    public void binerys() {
        Scanner sc = new Scanner(System.in);
        System.out.println("targetd name:");
        String tag_name = sc.next();

        Arrays.sort(array);
        System.out.println(array);
        if (Arrays.binarySearch(array, tag_name) >= 0) {
            System.out.printf("%s id found", tag_name);
        }
    }
}
