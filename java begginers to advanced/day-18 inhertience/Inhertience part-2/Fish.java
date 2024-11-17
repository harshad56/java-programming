public class Fish extends Animal {
    private int grills;
    private int fins;

    public Fish(String type, String size, double weight, int Grills, int Fins) {
        super(type, size, weight);
        grills = Grills;
        fins = Fins;
    }

    private void moveMuscles() {
        System.out.println("muscles are moving");
    }

    private void movebackFin() {
        System.out.println("backfin are moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);// you want parent class method use super.method name
        moveMuscles();
        if (speed == "slow") {
            movebackFin();
        }
    }

    @Override
    public String toString() {
        return "Fish [grills=" + grills + ", fins=" + fins + "]";
    }

}
