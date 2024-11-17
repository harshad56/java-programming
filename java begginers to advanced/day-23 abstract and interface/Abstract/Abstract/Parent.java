
public abstract class Parent {
    // here when write abstract method like this we need write abstract class
    // classname

    // abstract class means with help of abstract class create new classes
    // it means its a standard for other classes
    public Parent() {
        System.out.println("i am constructor of Base");
    }

    public void sayhello() {
        System.out.println("hello");
    }

    // abstract method,here some abstract methods or some non-abstrcat method
    // child classes used this methods according to their need
    abstract public void greet();
}

/*----------------------------------SUB-1---------------------------------- */
// child classes(child clases)
// sub-1
class Child extends Parent {
    // need overide method from parent class (ex-greet) or chnage class to abstract
    // class
    @Override
    public void greet() {
        System.out.println("hello child");
    }
}

/*----------------------------SUB-2---------------------------------------- */
// sub-2
class Child2 extends Parent {
    // child 2 is uesd parent class(parent) it abstract class so its complusary you
    // need overide method from parent class (ex-greet) or YOU not write want
    // overide method from parent so you can chnage class to abstract
    // class

    public void greet() {
        System.out.println("hello child2");
    }
}
/*----------------------------SUB-3---------------------------------------- */
// sub-3

// but YOU not write want
// overide method from parent so you can chnage class to abstract
// class
abstract class Child3 extends Parent {

    public void th() {
        System.out.println("hello child3");
    }
}