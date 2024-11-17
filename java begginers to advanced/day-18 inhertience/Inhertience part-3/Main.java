
public class Main {
    public static void main(String[] args) {
        // Bikes b = new Bikes("hillracer", "tyuio905", 78);

        Chieldofbike c = new Chieldofbike("hillracer", "tyuio905", 78, 123, 456);// Chieldofbike is child class of Bikes
        getprint(c, "547477");

        // here you can inherte parent class without calling pervoiux class or passes
        // atributes in them

        Chieldofchield newchield = new Chieldofchield("sportbike", "dshghds67", 100, 200, 789);
        getprint(newchield, "573736");
    }

    public static void getprint(Chieldofbike c, String range) {
        c.Range(range);
        c.makenoise();
        System.out.println(c);

        System.out.println("---------");

    }
}
