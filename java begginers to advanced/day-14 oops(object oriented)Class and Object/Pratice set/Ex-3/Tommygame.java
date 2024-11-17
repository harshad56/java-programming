
public class Tommygame {
    public static void main(String[] args) {
        tommy tom = new tommy();// create a instance
        tom.hit();
        tom.fire();
        tom.run();

    }
}

class tommy {
    public void hit() {
        System.out.println("hitting the enemy");
    }

    public void run() {
        System.out.println("run the enemy");
    }

    public void fire() {
        System.out.println("fire the enemy");
    }
}
