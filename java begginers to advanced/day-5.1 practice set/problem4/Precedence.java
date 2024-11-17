
public class Precedence {
    public static void main(String[] args) {
        float v = 5;
        float u = 7;
        float a = 9;
        float s = 2;

        float sum = (v * v - u * u) / (2 * a * s);
        /*
         * =25-49/2*9*2
         * =25-49/36
         * =-24/36
         * =0.666667
         * 
         */

        System.out.println(sum);
        /*---------------------------------------------------------- */
        int z = 7 * 49 / 7 + 35 / 7;
        /*
         * =343/7+35/7
         * =49+5
         * =54
         */
        System.out.println(z);
    }

}
