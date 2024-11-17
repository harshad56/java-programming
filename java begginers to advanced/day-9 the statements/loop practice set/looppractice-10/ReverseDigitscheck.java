
public class ReverseDigitscheck {
    public static void main(String[] args) {
        int number = 101;

        int reverse_ans = Reverseequaltoorignalno(number);
        if (number == reverse_ans) {
            System.out.println("it is a  Palindrome number" + reverse_ans);
        } else {
            System.out.println("it is not a  Palindrome number:" + reverse_ans);
        }
    }

    public static int Reverseequaltoorignalno(int num) {

        int reverse_no = 0;

        while (num > 0) {
            int reverse_order = num % 10;
            reverse_no = (reverse_no * 10) + reverse_order;
            num = num / 10;
        }

        return reverse_no;
    }
}
