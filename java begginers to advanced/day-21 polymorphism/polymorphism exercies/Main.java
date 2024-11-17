import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a car name: ,type Mitsubishi,Holden,Ford and quit for exit ");
            String Name = sc.nextLine();
            if (Name.equals("quit")) {
                break;
            }

            System.out.println("TYPE a cylinders");
            String cylinders = sc.nextLine();
            int cylinder = Integer.parseInt(cylinders);

            Car car = Car.getcar(cylinder, Name);
            getdata(car);
        }

    }

    public static void getdata(Car car) {
        car.startengine();
        car.accelerate();
        car.brake();
        System.out.println("car name is:" + car.getName());
        System.out.println("car cylinders needed:" + car.getCylinders());
        System.out.println("----------------------------");
    }
}
