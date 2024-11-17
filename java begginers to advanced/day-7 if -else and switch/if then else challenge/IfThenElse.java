
public class IfThenElse {
    public static void main(String[] args) {
        int score = 10000;
        int LevelComplted = 8;
        int bonus = 200;
        boolean gameover = true;

        int final_score = score;
        if (gameover == true) {

            final_score += (LevelComplted * bonus);
            System.out.println("Your final score is:" + final_score);
        }

    }
}
