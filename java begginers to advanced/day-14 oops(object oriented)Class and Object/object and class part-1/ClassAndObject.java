
public class ClassAndObject {

    public static void main(String[] args) {
        System.out.println("here we see example class and objcet");
        Employee harshad = new Employee();// Employee is class and we declred //here simple:-Employee is reference and right side new Employee is object  created
        // create a instance
        Employee karan = new Employee(); // we use many object with same class,// create a instance
        /*---------------------------------------------- */

        // setting attributes , id and name is the attribute,it is also called the
        // properties
        harshad.id = 12;
        harshad.name = "harshad";
        harshad.salary = 56;

        karan.id = 12;
        karan.name = "karan";
        /*---------------------------------------------- */

        // System.out.println(harshad.id);
        // System.out.println(harshad.name);
        harshad.getDetials();// it is method it also called behvaiour
        karan.getDetials();

        int salary = harshad.getSalary();
        System.out.println("your slalary is:" + salary);

    }
}

class Employee {

    // Employee is class ,class is the blueprint of object
    int id; // it instance varaible,decalring the instance vairable static keyword not used
    // methods

    String name;// it instance varaible,decalring the instance vairable static keyword not used
    // methods

    int salary;// it instance varaible,decalring the instance vairable static keyword not used
    // methods

    // here we use different methods without static keyword
    // it instance method
    public void getDetials() {
        System.out.println("the empoyee id is:" + id);
        System.out.println("the name enployee is:" + name);
    }

    /*---------------------------------------------- */
    // it instance method
    public int getSalary() {
        return salary;
    }
}
