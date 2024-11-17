//q1- create a abstract class use in subclass
abstract public class Pen {
    abstract void write();

    abstract void refill();
}

class Fountainpen extends Pen {
    public void write() {
        System.out.println("Writing with a fountain pen");
    }

    public void refill() {
        System.out.println("Refilling a fountain pen");
    }

    public void changenib() {
        System.out.println("changing the nib");
    }
}
