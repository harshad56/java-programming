
public class Precendence {
    public static void main(String[] args) {
        // predence and associativity(assocativity means its direction of calculation)
        // highest precdence for () then ++,-- then *,/ etc

        // example
        int t = 5;
        int u = 4;
        int c = t * u * (t / u); // highest precdence for () then *,/ etc
        /*
         * =5*4*1
         * =20*1
         * 20
         */
        System.out.println(c);

        /*--------------------------------------------------------------- */

        int a = 6 * 5 - 34 / 2; // here precedence of *,/ is same so rule calculation is goes(assoativity) left
                                // to right
        /*
         * precendence
         * =30-34/2 //means first *(mul) then /(divide) later - is do their work
         * =30-17
         * =13
         */

        int b = 34 / 2 - 6 * 5;// here precedence of *,/ is same so rule calculation is goes(assoativity) left
                               // to right
        /*
         * =16-6*5
         * =17-30
         * -13
         */
        System.out.println(a);
        System.out.println(b);
        /*-------------------------------------------------------------- */

        // example
        int d = 5;
        int e = 6;
        int sum = d * e / 2;// here precedence of *,/ is same so it goes left to right

        /*
         * =5*6/2
         * =30/2
         * =15
         */
        System.out.println(sum);

        /*---------------------------------------------------------- */
        int w = 7;
        int h = 8;
        int z = 6;
        int cal = w * w - 4 * h * z;
        /*
         * \
         * =49-32*z//here first*,/ then - (left to right rule)
         * =49-32*6
         * =49-192
         * =-143
         */
        System.out.println(cal);
    }
}

/*
 * precdence
 * 1)()
 * 2)++,--,! more precedence than *,/,%
 * 3)*,/,% when same means *,/ come in expersion it goes left to right
 * 4)+,- then gooes
 */