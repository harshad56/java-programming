/*
 * 1)in sub-class you can implement multiple interface and create a class
 * but in extends on subclass(childclass) using one class at a time
 * -------------------------------------------------------------
 * 2)imp-differnce betwen abstract and interface is:-
 * interface,you can support multiple inhertence in subclasses
 * but when time of abstract classes,it can't support multiple inhertence in subclasses
 * -------------------------------------------------------------------
 * rules:-
 * rule1:- declare interfcae with name
 * rule2:- method is defined in interface it is also complusory is defined in       subclasses
 * rule3:-when using interface in subclass use implements keyword
 *         here sub class you can use multiple interface

 */

//--------------------------------------------------------------------
// Remember that interface cannot implement another
// interfacebut it can extends mutilple interfaces, only classes can do that!
interface Bicycle {
    int avairble = 78;
    // 1) you can create a properties in interface
    // 2)it value is fix ,here deafult keyword final also can used
    // 3)and all properties in interface is final means fix

    public void addbrake(int decrement);

    // note-all methods in inherface is abstract
    void addspeed(int increment);
}

// -----------------------------------------------------------//
interface HornOnBicycle {
    public void bluehorn();

    void greenhorn();
}

/*--------------------------------------------------------------------- */
// it support multiple inherternce in subclasses beacuse of interface
class Avoncycle implements Bicycle, HornOnBicycle {

    public void addbrake(int decrement) {
        System.out.println("add breaks");
    }

    public void addspeed(int increment) {
        System.out.println("add speed");
    }

    public void bluehorn() {
        System.out.println("bluehorn is horn");
    }

    public void greenhorn() {
        System.out.println("grrenhorn is horn");
    }

}
