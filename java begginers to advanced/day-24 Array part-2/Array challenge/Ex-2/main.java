import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Sort sort = new Sort();
        sort.getintergers(5);

        int[] arrayvalue = sort.getarray();
        System.out.println(Arrays.toString(arrayvalue));

        int[] arrayvalue1 = sort.printarray();
        System.out.println(Arrays.toString(arrayvalue1));

    }
}
