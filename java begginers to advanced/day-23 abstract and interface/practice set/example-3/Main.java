//Q3:-demonstrate the polymorphism

public class Main {
    public static void main(String[] args) {
        Monkey m = new Human();
        m.bite();
        m.jump();
    }
}
