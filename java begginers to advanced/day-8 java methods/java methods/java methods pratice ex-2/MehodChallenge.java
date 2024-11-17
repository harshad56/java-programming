import java.util.Scanner;

public class MehodChallenge {
    public static void main(String[] args) {
        // first declared variable
        // second create a Displayposition method and paremeters are passed
        // third call the method and aruments are passed
        // fourth calculatehighscoerPosition method created paremeters are passed
        // fifth calculation part in calculatehighscoerPosition method is done
        // sixth method is called and aruments are passed
        // seventh here we want value in highscoerposition arguments so
        // we calculatehighscoerPosition method value assigned in highscoerposition

        Scanner sc = new Scanner(System.in);
        System.out.print("write a player name:");
        String player_Name = sc.next();
        System.out.print("write a player score:");
        int player_score = sc.nextInt();

        int highscoerposition = calculatehighscoerPosition(player_score);

        Displayposition(player_Name, highscoerposition);

        sc.close();
    }

    /*------------------------------------------------------------- */
    // it is a parametres( int player_score)
    public static int calculatehighscoerPosition(int player_score) {

        if (player_score >= 1000) {
            return 1;// it returns position
        }

        else if (player_score >= 500 && player_score < 1000) {
            return 2;
        }

        else if (player_score >= 100 && player_score < 500) {
            return 3;
        }

        else {
            return 4;
        }

    }

    /*------------------------------------------------------------- */

    // it is a parameters (String player_Name, int highscoerposition)
    public static void Displayposition(String player_Name, int highscoerposition) {

        System.out.printf("player_Name is %s and highscoerposition is %d", player_Name, highscoerposition);

    }
}
