import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game game = new Game();// create a instance
        System.out.println("Welcome to Rock Paper Scissors game");
        System.out.println("Enter rock, paper, or scissors");
        game.User_input = sc.next().toUpperCase();

        game.playgame();
    }

}

class Game {
    String User_input;
    String computer_ans;

    // it instance method
    public void playgame() {
        Random random = new Random();// Random class used with random object
        int computer_random_no = random.nextInt(3);

        String[] game_data = { "ROCK", "PAPER", "SCISSORS" };

        computer_ans = game_data[computer_random_no];

        System.out.println("Computer's answer is: " + computer_ans);

        if (User_input.equals(computer_ans)) {
            // WHEN you comparing the string with another string use equals()method not
            // "==","==" it is used when inter compersion
            System.out.println("It's a draw");
        }

        else if (User_input.equals("ROCK") && computer_ans.equals("PAPER") ||
                User_input.equals("PAPER") && computer_ans.equals("SCISSORS") ||
                User_input.equals("SCISSORS") && computer_ans.equals("ROCK")) {
            System.out.println("You lost");
        }

        else if (User_input.equals("ROCK") && computer_ans.equals("SCISSORS") ||
                User_input.equals("PAPER") && computer_ans.equals("ROCK") ||
                User_input.equals("SCISSORS") && computer_ans.equals("PAPER")) {
            System.out.println("You win");
        } else {
            System.out.println("Invalid input. Please enter rock, paper, or scissors.");
        }
    }
}
