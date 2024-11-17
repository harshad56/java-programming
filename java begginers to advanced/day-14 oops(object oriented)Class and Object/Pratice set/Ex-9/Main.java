import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter first name:");
        person.setFistname(scanner.next());

        System.out.println("enter last name:");
        person.setLastname(scanner.next());

        System.out.println("enter your age:");
        person.setage(scanner.nextInt());

        if (person.isTeen()) {
            System.out.println("full name of person is:" + person.getFirstname() + " " + person.getLastname());
            System.out.println("you are a teenager:" + person.isTeen());
        }

        else {
            System.out.println("full name of person is:" + person.getFirstname() + " " + person.getLastname());
            System.out.println("you are not a teenager:" + person.isTeen());
        }
    }
}
