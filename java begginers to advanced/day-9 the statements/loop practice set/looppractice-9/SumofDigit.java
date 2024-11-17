
public class SumofDigit {
    public static void main(String[] args) {
        System.out.println("the sum of digit of number 1234:" + DigitSum(1234));
        System.out.println("the sum of digit of number -45:" + DigitSum(-45));
        System.out.println("the sum of digit of number 123456:" + DigitSum(123456));
    }

    public static int DigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            sum += (number % 10);// it add remainder first sum value=4then3,2,1 adds then ans is=10
            number = number / 10;// 1234/10=123,then123/10=12,then12/10=1,then1/10=0 ends loop
        }

        return sum;
    }
}
