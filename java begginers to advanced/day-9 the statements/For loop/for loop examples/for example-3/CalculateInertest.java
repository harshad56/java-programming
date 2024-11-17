
public class CalculateInertest {
    public static void main(String[] args) {
        // example-1
        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestamount = CalculateInertestvalue(10000.0, rate);// method are called and aruguement are passed

            System.out.println("10000 at " + rate + " interest " + interestamount);
            System.out.println("---------------------------");
        }
        /*----------------------------------------------------------- */
        // example-2
        for (double value = 7.5; value <= 10; value += 0.25) {
            double interestamount = CalculateInertestvalue(10000.0, value);// method are call and aruguement are passed

            /*------------------break statement------------------------- */
            // we also break and continue statement in loops
            if (value > 8.5) {
                break;
            }
            /*-------------------------------------------------- */

            System.out.println("10000 at " + value + " interest " + interestamount);
        }
        /*----------------------------------------------------------- */
    }

    public static double CalculateInertestvalue(double amount, double rate) {
        return (amount * (rate / 100));
    }
}
