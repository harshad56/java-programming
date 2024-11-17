
public class Main {
    public static void main(String[] args) {
        Car car = new Car("2022 blue ferrari 297");
        getinfo(car);

        var ferrari = new GaspoweredCar("2022 blue ferrari 297", 13.5, 6);
        getinfo(ferrari);

        var tesla = new Electriccar("456 cghared volt speed", 13, 7);
        getinfo(tesla);

    }

    public static void getinfo(Car car) {
        car.startengine();
        car.drive();
        System.out.println("-----------------");
    }
}
