public class Monkey {

    public void jump() {
        System.out.println("monkey jumpes");
    }

    public void bite() {
        System.out.println("monkey bites..");
    }
}

/*---------------------------------------------------------- */
interface Basicanimal {
    void eat();

    void sleep();
}

class Human extends Monkey implements Basicanimal {
    public void eat() {
        System.out.println("they eats");
    }

    public void sleep() {
        System.out.println("they sleep");
    }

}
