
public class Animal {
    protected String type;// here using protected because we want use(type) in subclasses
    private String size;
    private double weight;

    public Animal() {

    }

    public Animal(String t, String s, double w) {
        type = t;
        size = s;
        weight = w;
    }

    public String toString() {
        return "Type: " + type + ", Size: " + size + ", Weight: " + weight;
    }

    public void move(String speed) {
        System.out.println(type + " moves " + speed);
    }

    public void makenoise() {
        System.out.println(type + " makes a noise");
    }
}
