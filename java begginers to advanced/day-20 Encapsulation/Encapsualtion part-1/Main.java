
public class Main {
    public static void main(String[] args) {
        // Player player = new Player();
        // player.name = "harshad";
        // player.health = 20;
        // player.weapon = "sword";

        // player.losehealth(10);
        // System.out.println("remaining helath=" + player.healthRemaining());
        // player.health = 200;// here anyone modify your game is big problem we use
        // encapsulation to privent
        // player.losehealth(11);
        // System.out.println("remaining helath=" + player.healthRemaining());

        Enhancedplayer enhancedplayer = new Enhancedplayer("harshad", 200, "yut");

        System.out.println("initial helath=" + enhancedplayer.healthRemaining());

        enhancedplayer.resoretehealth(10);
        System.out.println("remaining helath=" + enhancedplayer.healthRemaining());

        enhancedplayer.losehealth(100);
        System.out.println(enhancedplayer);
    }
}
