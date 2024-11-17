public class Car {
    private String Decription;

    public Car(String description) {
        this.Decription = description;
    }

    public void startengine() {
        System.out.println("engine is started");
    }

    protected void runEngine() {
        System.out.println("enigne quailty is good");
    }

    public void drive() {
        System.out.println("Car driving type is:" + getClass().getSimpleName());
        runEngine();
    }

}

class GaspoweredCar extends Car {
    private double averageperliter;
    private int cylinders;

    public GaspoweredCar(String description, double averageperliter, int cylinders) {
        super(description);
        this.averageperliter = averageperliter;
        this.cylinders = cylinders;
    }

    @Override
    public void startengine() {
        System.out.printf("gas %d is nedeeded for start the car run fastly %n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("car needed the %s the petrol", averageperliter);
    }

}

class Electriccar extends Car {
    private int battery;
    private int cylinders;

    public Electriccar(String description, int battery, int cylinders) {
        super(description);
        this.battery = battery;
        this.cylinders = cylinders;
    }

    @Override
    public void startengine() {
        System.out.printf("gas %d is nedeeded for start the car run fastly %n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("car needed the %d the battery", battery);
    }

}
