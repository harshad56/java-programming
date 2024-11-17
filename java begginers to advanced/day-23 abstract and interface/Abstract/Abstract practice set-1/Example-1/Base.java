
public class Base {
    public static void main(String args[]) {
        Sunstar s = new Employee();
        // sunstar is abstract but here use only reference like var refernce
        s.printInfo();
    }
}

/*-----------------------ABSTRACT CLASS-------------------------------------- */
// Abstract class
abstract class Sunstar {
    abstract public void printInfo();// here we not public beacuse public is deafault
}

/*----------------------CHILD CLASS----------------------------- */
// Abstraction performed using extends
class Employee extends Sunstar {
    public void printInfo() {
        String name = "avinash";
        int age = 21;
        float salary = 222.2F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}