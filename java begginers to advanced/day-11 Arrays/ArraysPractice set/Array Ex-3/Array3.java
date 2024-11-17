
public class Array3 {
    public static void main(String[] args) {
        int[] marks = { 12, 45, 67, 89, 47 };
        int size = marks.length;

        int sum = 0;
        int ans = 0;
        for (int element : marks) {
            sum += element;
            ans = sum / size;
        }
        System.out.println("the average are:" + ans);
    }
}
