
public class Bikes {
    private String type;
    private String engine;
    private int weight;

    public Bikes(String Type, String Engine, int Weight) {
        type = Type;
        engine = Engine;
        weight = Weight;
    }

    @Override
    public String toString() {
        return " Bikes type=" + type + ", engine=" + engine + ", weight=" + weight;
    }

    public void Range(String range) {
        System.out.println("range upto:" + range);
    }

    public void makenoise() {
        System.out.println("buyrrrrr");
    }

}
