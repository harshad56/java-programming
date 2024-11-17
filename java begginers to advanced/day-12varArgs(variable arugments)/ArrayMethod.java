
public class ArrayMethod {
    public static void main(String[] args) {
        System.out.println("the sum of 4 and 5 is:" + sum(4, 5));
        System.out.println("the sum of 3 ,5 and6 is:" + sum(3, 5, 6));
        System.out.println("the sum of 3 ,5 6,7 is:" + sum(3, 5, 6, 7));
    }

    public static int sum(int... array) {
        // avaible as int[] array;
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }
}
