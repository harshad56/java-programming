//Inhertience is uesd to borrow properties & methods from existing class
public class dog extends Animal {
    // inhertence parent class animal by using extends keyword

    public dog(String t, String s, double w) {
        super(t, s, w);// here super uses parent class constructor in the child class
                       // contructor
    }

    @Override
    public void makenoise() {
        /*
         * Overriding a method is when create a method on a subclass,which has the same
         * signnature(name),or return type as method on a super class
         * you overtide parent class method when you want you want the child class to
         * show different behavoiour for the method
         */

        super.makenoise();// you want parent class method use super.method name
        System.out.println("dog run and walk(method use from parent class animal using super)");

        // here add some more code new concepy using protected access modifer i8n animal
        // class here using type variable
        if (type == "woof") {
            System.out.println("woof-woof");
        }
    }

    @Override
    public void move(String speed) {
        super.move(speed);// you want parent class method use super.method name
        System.out.println("here you see overide method dog class using parent class ");
        if (speed == "slow") {
            wagTail();
        } else {
            bark();
        }
    }

    // add new methods
    public void bark() {
        // here add some more code new concept using protected access modifer i8n animal
        // class here using type variable
        System.out.println(type + "barking");
    }

    public void wagTail() {
        System.out.println(type + " wag a tail");
    }
}
