
public class Employee_setName_salary {

    public static void main(String[] args) {
        // Excerices -1
        Employee harshad = new Employee();// create a instance
        harshad.setSalary(56);// passed the attributes
        harshad.setName("harshad");

        harshad.getDetials();// using object method is called
        System.out.println("\n...............................");
        /*------------------------------------------- */

        // Excerices-2
        cellphone relme = new cellphone();//here simple:-cellphoneis reference and right side new cellphone is object  
        relme.setPhone_name("relme");// attribute
        relme.vibrate();
        relme.ring();
    }
}

// Excerices-1 class
class Employee {

    private int salary;
    private String name;

    // first the set the salary
    // second the get the salary
    // same with name
    // it instance method
    public void setSalary(int s) {
        // when you not returing value so setting the value use void
        salary = s;// when setters the value use parameters like here(int s)
    }

    // it instance method
    public int getSalary() {
        // here you return the value so write return type
        return salary;
    }

    // it instance method
    public void setName(String n) {
        name = n;// when setters the value use parameters like here (string n)
    }

    // it instance method
    public String getName() {
        return name;
    }

    // it instance method
    public void getDetials() {
        System.out.println("Employee name is:" + name);
        System.out.printf("%s salary is %d", name, salary);
    }
}

/*------------------------------------------------- */
// Excerices-2 class
class cellphone {

    private String Phone_name;

    public void setPhone_name(String s) {
        Phone_name = s;
    }

    public String getPhone_name() {
        return Phone_name;
    }

    public void vibrate() {
        System.out.printf("%s is vibrating......\n", Phone_name);
    }

    public void ring() {
        System.out.printf("%s is ringing....", Phone_name);

    }

}
