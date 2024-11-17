
public class Chieldofbike extends Bikes {
    private int speed;
    private int acceleration;

    public Chieldofbike(String type, String engine, int weight, int Speed, int Accerration) {
        super(type, engine, weight);// argument passed
        speed = Speed;
        acceleration = Accerration;
    }

    @Override
    public String toString() {
        return "Chieldofbike speed=" + speed + ", acceleration=" + acceleration + super.toString();
    }

}
