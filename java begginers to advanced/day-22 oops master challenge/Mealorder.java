public class Mealorder {
    private Burger burger;// Composition is a "has-a" relationship, where a class contains an object of
                          // another class as a member variable.
    private Item drink;
    private Item side;

    public Mealorder() {
        this("regular5", "coke", "fries");
    }

    public Mealorder(String burgertype, String drinktype, String sidetype) {
        burger = new Burger(burgertype, 4.0);
        drink = new Item("DRINK", drinktype, 1.00);
        side = new Item("SIDE", sidetype, 1.00);

    }

    public double gettotalprice() {
        return side.adjuestprice() + drink.adjuestprice() + burger.adjuestprice();
    }

    public void printItemizedlist() {
        burger.printitem();
        drink.printitem();
        side.printitem();
        System.out.println("-".repeat(30));
        Item.printitem("Total Price", gettotalprice());
    }

    public void addBurgetToppings(String extra1, String extra2, String extra3) {
        burger.addtopping(extra1, extra2, extra3);
    }

    public void setsize(String size) {
        drink.setsize(size);
    }

}
