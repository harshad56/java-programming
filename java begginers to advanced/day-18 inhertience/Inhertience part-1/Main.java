
public class Main {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        // in derived class you use base class methods(using inhertence)
        Derived d = new Derived();
        d.setX(5);// inherite from parent class Base
        d.setY(7);// new data in derived class
        System.out.println(d.getX());// inherite from parent class Base
        System.out.println(d.getY());
    }
}
