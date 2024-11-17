
public class Main {
    public static void main(String[] args) {
        // Item coke = new Item("DRINK", "COKE", 1.4);
        // coke.printitem();
        // coke.setsize("LARGE");
        // coke.printitem();

        // Burger burger = new Burger("regular", 3.00);
        // burger.addtopping("BACON", "CHESSE", "MAYO");
        // burger.printitem();

        Mealorder mealorder = new Mealorder();
        mealorder.addBurgetToppings("BACON", "CHESSE", "MAYO");
        mealorder.setsize("LARGE");
        mealorder.printItemizedlist();
        System.out.println("-------------------------------------" + "\n");

        Mealorder secondmealorder = new Mealorder("turkey", "coke", "chili");
        secondmealorder.addBurgetToppings("BACOM", "CHESSE", "MAYO");
        secondmealorder.setsize("SMALL");
        secondmealorder.printItemizedlist();

    }
}
