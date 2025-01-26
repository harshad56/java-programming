
// a static nested class
// outer class
class OuterClass {
    // static member

    static int outer_x = 10;

    // instance(non-static) member
    int outer_y = 20;

    // private member
    private static int outer_private = 30;

    static class StaticNestedClass {

        void display() {
            // can access static member of outer class
            System.out.println("outer_x = " + outer_x);

            System.out.println("outer_private = "
                    + outer_private);

            OuterClass out = new OuterClass();
            System.out.println("outer_y = " + out.outer_y);

        }
    }
}

// Driver class
public class StaticNestedClassDemo {

    public static void main(String[] args) {
        // accessing a static nested class
        OuterClass.StaticNestedClass nestedObject
                = new OuterClass.StaticNestedClass();

        nestedObject.display();
    }
}
