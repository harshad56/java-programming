public class Enhancedplayer {
    private String name;
    private int health;
    private String weapon;

    public Enhancedplayer(String Name) {
        this(Name, 100, "sword");
    }

    // to fix inital valuee fix in game like health=100,it fix value you need write
    // likt in this consrtuctor
    public Enhancedplayer(String name, int health, String weapon) {
        this.name = name;

        if (health <= 0) {
            this.health = 1;
        } else if (health > 100) {
            this.health = 100;
        } else {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void losehealth(int damage) {
        health = health - damage;
        if (health <= 0) {
            System.out.println(" has died");
            health = 1;
        }
    }

    public int healthRemaining() {
        return health;
    }

    public void resoretehealth(int extaHelath) {
        health = health + extaHelath;
        if (health > 100) {
            System.out.println("player is fully resorted");
            health = 100;
        }
    }

    @Override
    public String toString() {
        return "Enhancedplayer name=" + name + ", health=" + healthRemaining() + ", weapon=" + weapon;
    }

}
