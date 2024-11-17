import java.util.Scanner;

public class file {
    int chances = 1;

    Scanner sc = new Scanner(System.in);

    public void formualcaluclation() {

        System.out.println("calculatiion for cylinder,recatngle:type cylinder or rectangle");
        String type = sc.next().toLowerCase();

        /*----------------------------------------------------------- */
        if (type.equals("cylinder")) {
            System.out.println("what you want to print surfacearea ,area ,volume ");
            String choice = sc.next().toLowerCase();

            /*----------------------------------- ----*/
            if (choice.equals("surfacearea")) {
                System.out.println("enter radius :");
                double radius = sc.nextDouble();

                System.out.println("enter height :");
                double height = sc.nextDouble();

                Cylinder cylinder = new Cylinder(radius, height);
                cylinder.surfaceofcylinder();

            }
            /*----------------------------------- ----*/

            else if (choice.equals("volume")) {
                System.out.println("enter radius :");
                double radius = sc.nextDouble();

                System.out.println("enter height :");
                double height = sc.nextDouble();

                Cylinder cylinder = new Cylinder(radius, height);
                cylinder.volumofcylinder();
            }
            /*----------------------------------- ----*/

            else {
                System.out.println("they dont have formaula");
            }
        }
        /*----------------------------------------------------------- */

        else if (type.equals("recatangle")) {
            System.out.println("what you want to print surface area ,area ,volume ");
            String choice = sc.next().toLowerCase();

            if (choice.equals("area")) {
                System.out.println("enter the lenght:");
                int lenght = sc.nextInt();

                System.out.println("enter the breadth:");
                int breadth = sc.nextInt();

                rectangle rec = new rectangle(lenght, breadth);
                rec.recatnglearea();

            }
            /*----------------------------------- ----*/

            else {
                System.out.println("they dont have formula");
            }

        }

        /*----------------------------------------------------------- */

        else {
            System.out.println("not avialable");
        }

    }

    public void Calcutiontimes() {

        for (int i = chances; i < 10; i++) {
            formualcaluclation();// when user enter it continue

            System.out.print("\n" + "if you want continue:type 'yes' or 'no':");
            String input = sc.next().toLowerCase();
            if (input.equals("no")) {
                System.out.println("thanks for using this software");
                break;
            }
            chances++;
        }

    }

}
