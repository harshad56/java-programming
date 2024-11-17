
public class methodsarray {
    public static void main(String[] args) {
        int[] array = { 34, 56, 78 };
        changes(array);
        System.out.println("the value changes after using method replace 34:" + array[0]);
    }

    public static void changes(int[] array) {
        array[0] = 10;
    }

}
