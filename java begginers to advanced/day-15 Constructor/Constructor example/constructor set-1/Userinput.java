import java.util.Random;
import java.util.Scanner;

public class Userinput {
    int cominput;
    int input;
    int chances = 5;

    public Userinput() {
        Random random = new Random();
        int randomno = random.nextInt(100);
        cominput = randomno;
        System.out.println("Computer's number is: " + cominput);
    }

    // it instance method
    public void takeUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        input = scanner.nextInt();
    }

    // it instance method
    public void isCorrectNumber() {

        while (chances > 0) {

            takeUserInput();// call the takeuserinput method for in while loop get user input again angain
                            // for to guess no is same
            // or not util it find

            if (cominput == input) {
                System.out.println("You guessed it!");
                break;

            } else if (cominput > input) {
                System.out.println("Your number is smaller than computer's number");
                chances--;
                System.out.println("You have " + chances + " chances left.");

            } else if (cominput < input) {
                System.out.println("Your number is bigger than computer's number");
                chances--;
                System.out.println("You have " + chances + " chances left.");
            }
        }

        if (chances == 0) {
            System.out.println("You didn't guess the number. The number was " + cominput);
        }
    }

}