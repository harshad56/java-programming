
public class ThePrimeNumberChalleneg {
    public static void main(String[] args) {
        // System.out.println("0 is " + (isPrime(0) ? "" : "not") + " a prime
        // number");//ternary operator
        // System.out.println("1 is " + (isPrime(1) ? "" : "not") + " a prime number");
        // System.out.println("2 is " + (isPrime(2) ? "" : "not") + " a prime number");
        // System.out.println("17 is " + (isPrime(17) ? "" : "not") + " a prime
        // number");
        // System.out.println("4 is " + (isPrime(4) ? "" : "not") + " a prime number");
        // or
        int count = 0;
        for (int i = 10; i <= 50; i++) {
            if (isPrime(i) == true) {
                System.out.println("number:" + i + "is a prime number");
                count++;

                if (count == 3) {
                    break;// to print first 3 prime no
                }

            } else {
                System.out.println("number:" + i + "is a not prime number");
            }
        }
        System.out.println("numbers between 10 to 50 are prime or not count is:" + count);

    }

    public static boolean isPrime(int wholenumber) {
        if (wholenumber < 2) {
            return false;
        }
        // when wholenumber also 2 when condition become false
        // so it loop end and out of loop goes he had true value so also become
        // prime number
        for (int divisior = 2; divisior < wholenumber; divisior++) {
            if (wholenumber % divisior == 0) {
                return false;// 1)example wholeno=4 it got=0 but here we have false it is not prime no

                /*
                 * 2) example wholeno=15 it not got=0 so divisior++ it goes 2+1=3 so
                 * wholeno(15)%divisior(3)==0 it true but code goes in false so 15 is not prime
                 * number
                 */

                /*
                 * 3) example- when wholeno=17 it not got=0 so divisior++ it goes 2+1=3 so
                 * wholeno(17)%divisior(3) not got 0 so it goes on divisior++ under upto
                 * wholeno(17) when divior is 16 so itstop loop because of condition
                 * (divisior<wholenumber) it ends loop and automaticaly goes return true value
                 * like
                 * downside example
                 */
            }

        } // when wholenumber also 2 when condition become false
          // so it loop end and out of loop goes he had true value so also become
          // prime number
        return true;
    }
}
