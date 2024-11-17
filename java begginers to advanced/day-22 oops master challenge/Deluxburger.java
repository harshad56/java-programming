public class Deluxburger extends Burger {
    Item delux1;
    Item delux2;

    public Deluxburger(String name, double price) {
        super(name, price);
    }

    public void addtopping(String extra1, String extra2, String extra3, String extra4, String extra5) {
        super.addtopping(extra1, extra2, extra3);
        delux1 = new Item("Topping", extra4, 0);
        delux2 = new Item("Topping", extra5, 0);
    }

    @Override
    public void printItemizedlist() {
        super.printItemizedlist();
        if (delux1 != null) {
            delux1.printitem();
        }
        if (delux2 != null) {
            delux2.printitem();
        }
    }

}
