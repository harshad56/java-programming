// you can create class file in different file but add public but two or more classes their only one public class 
public class Car {
    private String make;// but varibles are private sometimes so use getters and setters method
    private String model;// it instance varaible
    private String color;// it instance varaible
    private int doors;// it instance varaible
    private boolean convertible;

    /*-------------------------------------------------------------- */
    // here we use geterrs and seterrs for some varible to use in main java class
    // file
    public void setmake(String maker) {
        make = maker; // when you not returing value so setting the value use void
    }

    public String getmake() {
        return make;// here use return type
    }
    /*-------------------------------------------------------- */

    public void setmodel(String modelans) {
        model = modelans;
    }

    public String getmodel() {
        return model;
    }
    /*-------------------------------------------------------- */

    public void setcolor(String colorans) {
        color = colorans;
    }

    public String getcolor() {
        return color;
    }
    /*-------------------------------------------------------- */

    public void setdoors(int valueans) {
        doors = valueans;
    }

    public int getdoors() {
        return doors;
    }

    /*-------------------------------------------------------- */

    public void setConvertible(boolean value) {
        convertible = value;
    }

    public boolean getConvertible() {
        return convertible;
    }
    /*---------------------------------------------------------------------- */

    public void describeCar() {
        System.out
                .println(doors + "-Door " +
                        color + " " +
                        make + " " +
                        model + " " +
                        (convertible ? "convertible" : ""));
    }
}

class Message {

    public void messageoutput() {
        System.out.println("Hello");
    }

}