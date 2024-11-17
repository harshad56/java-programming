
public class Increment {
    public static void main(String[] args) {
        int y = 7;
        int sum = ++y * 8;// here hiher precdence is ++,-- then*,/
        /*
         * =++7
         * =1+7=8
         * =8*8
         * 64
         */
        System.out.println(sum);

        // what about char so here example

        char ch = 'a';
        System.out.println(++ch);// here ch is a and c++ is b
    }
}
