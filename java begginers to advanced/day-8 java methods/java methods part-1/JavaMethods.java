//void is java keyword meaning no data is returned from a method 
public class JavaMethods {
    public static void main(String[] args) {
        // calculation1
        // first step variablse declraied
        // second step calculation code is written and calculatescoer method created
        // third step calculation code is paste in CalculateScore method
        // fourth step parameters are passed in CalculateScore method
        // Fifth step CalculateScore method is called and passed arguments
        int score = 10000;
        int LevelComplted = 8;
        int bonus = 200;
        boolean gameover = true;

        int high_score1 = CalculateScore(score, LevelComplted, bonus, gameover);// method is call

        System.out.println("Your final score is:" + high_score1);
        /*---------------------------------------------------------- */

        // calculation2
        /*
         * int score = 40000;
         * int LevelComplted = 6;
         * int bonus = 600;
         * boolean gameover = true;
         */
        // or you do like here yu can also do same variable like this
        ;
        int high_score2 = CalculateScore(score = 40000, LevelComplted = 6, bonus = 600, gameover = true);

        System.out.println("Your final score is:" + high_score2);
        /*
         * 1)method is call
         * 2)"score, LevelComplted, bonus, gameover, final_score" are arguments
         * 3)here we many time call calculatescore method pass different values
         * in arguemts(variables)
         */
    }

    // create a java method
    // in calculateescore method we use parameters (we use window+; for arrow)→
    public static int CalculateScore(int score, int LevelComplted, int bonus, boolean gameover) {
        int final_score = score;
        if (gameover == true) {
            final_score += (LevelComplted * bonus);

        }
        return final_score;// it returns the value in calculatescoer method

    }
}
