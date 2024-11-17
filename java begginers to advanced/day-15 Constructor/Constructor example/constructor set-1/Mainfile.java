
public class Mainfile {
    public static void main(String[] args) {

        Userinput userinput = new Userinput();
        /*
         * do not call takeuserinput method here beacuse it used in isCorrectNumber()
         * method for in while loop get user input again angain for to guess no is same
         * or not util it find
         */
        userinput.isCorrectNumber();
    }
}
