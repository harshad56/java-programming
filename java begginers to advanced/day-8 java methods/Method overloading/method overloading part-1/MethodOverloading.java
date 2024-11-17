
public class MethodOverloading {
    public static void main(String[] args) {
        // method overloading menas same method name but different parametrs,arguments
        // or different work and somethimes
        // but only changing return data type not help any case

        int new_score = CalculateScore("harshad", 300);
        System.out.println("new score:" + new_score);// call(mehod1)calculatescore method passed arguments
                                                     // playername,score

        /*----------------------------------------------------------- */
        int new_score1 = CalculateScore(500);
        System.out.println("new score1:" + new_score1);// call(mehod2) calculatescore method passed arguments score
        /*----------------------------------------------------------- */
        CalculateScore();// call(mehod3)

    }

    /*----------------------------------------------------------------------- */
    // method 1
    public static int CalculateScore(String playerName, int score) {
        System.out.println("player " + playerName + " scored " + score + " points");
        return score * 1000;

    }
    /*----------------------------------------------------------- */

    // method 2
    // you can aslo do with method like this
    // you can use another method in this method

    public static int CalculateScore(int score) {
        return CalculateScore("viraj", score);// here you callmethod 1

    }
    /*----------------------------------------------------------- */

    // method 3
    /*
     * thier is not need add parameters in method but return type needed when
     * datatypelike-
     * type like-int,float,long,boolean etc
     * but when void write their is no need to write return type
     */
    public static int CalculateScore() {
        System.out.println("no player name,no playuer score");
        return 0;

    }

}
