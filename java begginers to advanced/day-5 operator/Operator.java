
public class Operator {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // 1)arthemtic operator +,-,*,/,%,++,--
        int a = 1;
        int b = a + 2;

        int e = b % 2;// here we get remainder(remaining value) 1
        System.out.println("arthemtic operator");
        System.out.println(b);
        System.out.println(e);

        int j = 6;
        j++;// increament operator
        System.out.println(j);

        int k = 6;
        k--;// decrement
        System.out.println(k);

        /*------------------------------------------------------------------- */

        // 2)assigment operator =,+=,*=,-=

        int c = 6;
        c += 1.4;

        int d = 2;
        d *= c;

        float g = 9;
        g *= 2.4;

        System.out.println("assigment operator");
        System.out.println(c);
        System.out.println(d);
        System.out.println(g);
        /*-------------------------------------------------------------------- */

        // 3)compersion operator ==,>,<,<=,>=
        int z = 6;
        int x = 5;
        System.out.println("compersion operator");
        System.out.println("compersionn operator:" + (z == x));// check it is equal or not
        System.out.println(z > x); // check > it is greater than
        System.out.println(z < x);// check < it is less than

        /*-------------------------------------------------------------------- */

        // 4)logicla operator &&(and), ||(or),!(not)
        System.out.println("logical operator");
        System.out.println(78 > 5 && 89 > 8);// it gets true but when we change condintion

        System.out.println(78 > 5 && 89 < 8);// it gets false beacuse 1st condition is right but 2nd condition is wrong
        // so when both condition is right then we get true in &&(and) operator

        System.out.println(78 > 5 || 89 < 3);// but or opertor check only one condiotion is right then get true
        System.out.println(23 != 45);// it means 23 is not equal to 45

        /*------------------------------------------------------- */
        // 5)bitwise operator &
    }
}
