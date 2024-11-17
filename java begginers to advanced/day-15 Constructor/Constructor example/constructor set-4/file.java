
public class file {
    public static void main(String[] args) {
        rectangle rec = new rectangle();// default values set using constructor

        rectangle rec1 = new rectangle(45, 67);

        System.out.println(rec.getLenght());
        System.out.println(rec.getBreadth());

        System.out.println(rec1.getLenght());
        System.out.println(rec1.getBreadth());
    }
}
