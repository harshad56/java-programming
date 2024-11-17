//Q2:-create class monkey and methods and class human that inherted the monkey and imp-lements basicanimal interface
public class Monkey {

    public void jump() {
        System.out.println("monkey jumpes");
    }

    public void bite() {
        System.out.println("monkey bites..");
    }
}

class Human extends Monkey implements Basicanimal {
    public void eat() {
        System.out.println("they eats");
    }

    public void sleep() {
        System.out.println("they sleep");
    }

}
