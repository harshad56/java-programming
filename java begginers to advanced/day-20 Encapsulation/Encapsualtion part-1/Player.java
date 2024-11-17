//so here problem this can anyone modify main file like thisplayer.health =
// 200;
//so we check encapsulation
public class Player {

    public String name;
    public int health;
    public String weapon;

    public void losehealth(int damage) {
        health = health - damage;
        if (health <= 0) {
            System.out.println(" has died");
        }
    }

    public int healthRemaining() {
        return health;
    }

    public void resoretehealth(int extaHelath) {
        health = health + extaHelath;
        if (health > 100) {
            System.out.println("player is fully resorted");
        }
    }

}

/*
 * Encapsulation is a core concept in object-oriented programming that involves
 * wrapping data and the methods that manipulate that data within a single unit,
 * known as a class. In Java, encapsulation is used to hide the internal state
 * and functionality of an object from the outside world and to protect the
 * object's integrity by preventing unauthorized access and modification.
 * 
 * Implementing Encapsulation in Java
 * 
 * Encapsulation in Java is typically achieved by:
 * 
 * Declaring the class variables as private.
 * 
 * Providing public getter and setter methods to access and update the value of
 * the private variables.
 */

/*
 * Advantages of Encapsulation
 * 
 * Data Hiding: Encapsulation allows the hiding of data implementation by
 * restricting access to the internal state of the object. This means that the
 * object's fields can only be accessed through its public methods.
 * 
 * Increased Flexibility: You can make class variables read-only or write-only
 * by providing only getter or setter methods.
 * 
 * Reusability and Easy Maintenance: Encapsulated code is more flexible and
 * easier to change with new requirements. It also improves the re-usability of
 * the underlying code.
 * 
 * Unit Testing: Encapsulated code is easier to test for unit testing since it
 * can be tested in isolation.
 */
