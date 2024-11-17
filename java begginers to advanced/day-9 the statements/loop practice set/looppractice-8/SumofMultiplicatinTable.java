// package java begginers to advanced.day-9 the statements.loop practice set.looppractice-8;

// public class SumofMultiplicatinTable {

// }

public class SumofMultiplicatinTable {
    public static void main(String[] args) {
        int n = 8;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d=%d\n", n, i, n * i);
            sum += n * i;
        }
        System.out.println("sum is:" + sum);
    }
}
