
public class PrintStarsuringWhile {
    public static void main(String[] args) {
        int i = 5;
        while (i >= 1) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
            i--;
        }
    }
}
