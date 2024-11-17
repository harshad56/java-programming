public class TypeCasting {

    public static void main(String[] args) {

        // char+,*int it get int
        // example
        char ch = 'a';
        // ch=ch+8;
        // here int+char get int we do type casting
        ch = (char) (ch + 8);
        System.out.println(ch);

        int a = 5;
        int b = 6;
        float divide = (float) b / a;// type casting here a nd b are int so we convert into float to get value
        System.out.println(divide);

        /*------------------------------------------------------------------ */

        // here some example why we write float b/a\
        int myfloatvalue = 58 / 7;// here we get 8 only
        System.out.println(myfloatvalue);

        float myfloatvalue1 = 58f / 7f;// here we get 8.2345 beacuse of when write only 58/7 it treat like int value so
                                       // we convert into float here
        System.out.println(myfloatvalue1);

    }
}