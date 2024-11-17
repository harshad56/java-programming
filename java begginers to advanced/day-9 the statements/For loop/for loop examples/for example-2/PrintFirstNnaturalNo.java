
public class PrintFirstNnaturalNo {
    public static void main(String[] args) {
        // print First n natural no in reverse order
        // ex-1
        int n = 10;
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
        /*----------------------------------------------------------- */

        // ex-2
        // but you want print numbers in reverse order you do like this
        for (int i = 5; i >= 0; i--) {
            // or i!=0 you can write like this also
            System.out.println(i); // it print 5,4,3,2,1,0 like this
        }

    }
}