
public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.greet();// child class from abstract class that can crate the object but
        child.sayhello();
        // abstract class not create object because it is platfrom for create class
        // like child classes
        /*
         * ex- when create a boject it get error
         * Parent p = new Parent();
         * // here we get error like -Parent is abstract; cannot be instantiated
         * p.greet();
         * 
         * same forchild 3
         * Child3 child3 = new Child3();
         * child3.greet();
         * // here we get error like -Parent is abstract; cannot be instantiated
         */

        Parent p = new Child();// but you can abtract class as reference
        p.greet();

    }
}
