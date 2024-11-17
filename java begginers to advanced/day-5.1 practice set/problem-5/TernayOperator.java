
public class TernayOperator {
    public static void main(String[] args) {
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;

        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("MyValuesTotal = " + myValuesTotal);

        double theRemainder = myValuesTotal % 40.00;
        System.out.println("theRemainder = " + theRemainder);

        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        /*
         * here we use ternery(?,:) when condition is true value assin variable false or
         * value it false it get value assin in variable
         */

        System.out.println("isNoRemainder = " + isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }

    }
}
