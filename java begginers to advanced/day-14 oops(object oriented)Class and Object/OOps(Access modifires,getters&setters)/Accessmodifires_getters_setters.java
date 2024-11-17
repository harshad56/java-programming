// Acess Modifires
// 1)public 
// 2)private:-there are private to use,do want access use getters and setters
//3) protected
//4) default

public class Accessmodifires_getters_setters {
    public static void main(String[] args) {
        Employee harshad = new Employee();// harshad is object using class Employee

        harshad.setid(45);// attributes are passed(properties)
        harshad.setname("Harshad");

        harshad.getDetials();// method use(behaivoiur)
    }

}

class Employee {
    // Employee is class ,class is the blueprint of object
    private int id;// private modifires
    private String name;// it instance varaible,decalring the instance vairable static keyword not used
                        // methods

    // when setters the value use parameters like here
    // it instance method
    public void setid(int i) {
        // when you not returing value so setting the value use void
        // here we set(setters)the id
        id = i;// here i value goes to id varible
    }

    // after the set the id then we use get(getters) the id
    // it instance method
    public int getid() {
        return id;
    }

    // aslo do with same with private string name
    // it instance method
    public void setname(String n) {
        name = n;// here n value goes name variable
    }

    // it instance method
    public String getName() {
        return name;
    }

    // it instance method
    public void getDetials() {
        System.out.println("empoyee id is :" + id);// from getid,getName
        System.out.println("employee name is :" + name);
    }
}
