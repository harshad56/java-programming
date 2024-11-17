//Refernce vs Objcet vs Instance vs Class

public class info {
    public static void main(String[] args) {
        Demo bluehouse = new Demo("blue");// the full line also called instance
        Demo anotherhouse = bluehouse;
        /*
         * 1)here Demo is the class
         * 2)bluehouse is object,but bluehouse also is reference for Demo
         * 
         * 3) Demo bluehouse = new Demo("blue");// the full line also called instance
         * 
         * 4)anotherhouse is reference using(bluehouse)object and memmory on demo class
         * 
         * 5)anotherhouse and bluehouse at same position on the Demo class object memory
         */

        System.out.println("demo instance set the coler is:" + bluehouse.getColor());
        System.out.println("demo instance set the coler is for the another house refernce:" + anotherhouse.getColor());
        /*---------------------------------------------------------- */

        anotherhouse.setColor("yellow");

        System.out.println("demo instance set the coler is for the another house refernce aftersetCor to ' yellow':"
                + anotherhouse.getColor());

        System.out.println("demo instance set the coler is:" + bluehouse.getColor());

        /*
         * here value set yellow at anotherhouse object reference
         * and alse bluehouse memory(blue to yellow also) changed because of refernce
         */

        /*---------------------------------------------------------- */
        Demo greehouse = new Demo("green");// new instance
        anotherhouse = greehouse;

        /*
         * two object greenhouse(Demo),bluehouse(Demo)
         * three refernce is the bluehouse,anotherhouse,greehouse
         */

        System.out.println(bluehouse.getColor());// print yellow
        System.out.println("demo instance set the coler is:" + greehouse.getColor());// green
        System.out.println("demo instance set the coler is:" + anotherhouse.getColor());// green

    }
}
