import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        calculation cal = new calculation();// calculation class and cal is object
        Scanner sc = new Scanner(System.in);// same here Scanner is class and sc is object

        /*---------------------------------------------- */
        // here we get input from user and passed to attribute from object called
        System.out.println("Enter the out of marks:");
        cal.out_of = sc.nextInt();// here cal object has attribute(out_of) we get the value from user input
        /*------------------------------------------------- */
        System.out.println("Enter the fisrt number:");
        cal.sub1 = sc.nextInt();
        /*------------------------------------------------- */
        System.out.println("Enter the second number:");
        cal.sub2 = sc.nextInt();
        /*----------------------------------------------- */
        System.out.println("Enter the third number:");
        cal.sub3 = sc.nextInt();

        cal.Calculation();// method is called so print the calcualtion after input passed
        sc.close();
    }
}

class calculation {
    int out_of;
    int sub1;
    int sub2;
    int sub3;

    public void Calculation() {
        // Calculation is done here
        float total = sub1 + sub2 + sub3;
        float out_of_marks = out_of * 3;

        float percentage = (total / out_of_marks) * 100;

        if (percentage >= 40.0) {
            System.out.println("your are pass");
        }

        else if (percentage <= 39.0 && percentage >= 1.0) {
            System.out.println("you are fial");
        }

        else {
            System.out.println("some mistake");
        }
    }

}
