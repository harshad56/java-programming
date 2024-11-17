//An interface can also extend multiple interfaces. 

// Java program to demonstrate multiple inheritance
// in interfaces

import java.io.*;

interface intfA {
    void geekName();
}

interface intfB {
    void geekInstitute();
}

// always remember that interfaces always extends interface
// but a class always implements a interface
interface intfC extends intfA, intfB {
    void geekBranch();
}

// class implements both interfaces and provides
// implementation to the method.
class sample implements intfC {
    public void geekName() {
        System.out.println("Rohit");
    }

    public void geekInstitute() {
        System.out.println("JIIT");
    }

    public void geekBranch() {
        System.out.println("CSE");
    }

    public static void main(String[] args) {
        sample ob1 = new sample();

        // calling the method implemented
        // within the class.
        ob1.geekName();
        ob1.geekInstitute();
        ob1.geekBranch();
    }
}