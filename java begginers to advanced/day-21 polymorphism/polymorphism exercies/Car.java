public class Car {
    private boolean Engine;
    private int cylinders;
    private String name;
    private int wheels;
    private String type;

    // ------------------CONSTRUCTOR------------------------------------//
    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    // -------------------------------------------------------//
    public void startengine() {
        System.out.println("car's engine is starting.");
        type = getClass().getSimpleName();
        System.out.println("car type is:->" + type);
    }

    public void accelerate() {
        System.out.printf(" %s is accelerating %n", type);
    }

    public void brake() {
        System.out.printf("%s is braking %n", type);
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public static Car getcar(int cylinders, String name) {
        return switch (name.toUpperCase().charAt(0)) {
            case 'M' -> new Mitsubishi(cylinders, name);
            case 'H' -> new Holden(cylinders, name);
            case 'F' -> new Holden(cylinders, name);
            default -> new Car(cylinders, name);

        };
    }

}
// sub-classes
/*---------------------------------------------------------------------------- */

class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void accelerate() {
        super.accelerate();
        System.out.println("mitsubishi is best");
    }

    @Override
    public void brake() {
        super.brake();
    }

    @Override
    public void startengine() {
        super.startengine();
    }

}

/*---------------------------------------------------------------------------- */
class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void brake() {
        super.brake();
    }

    @Override
    public void startengine() {
        super.startengine();
    }
}

/*---------------------------------------------------------------------------- */
class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void brake() {
        super.brake();
    }

    @Override
    public void startengine() {
        super.startengine();
    }
}
