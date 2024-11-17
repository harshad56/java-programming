public class Burger extends Item {
    // inhertence
    private Item extra1;// Composition is a "has-a" relationship, where a class contains an object of
                        // another class as a member variable.
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price) {
        super("burger", name, price);
        // encapsulation here alrdey decalred type
        // so type burger so getname method return only name breacuse parent method
        // if (type.equals("SIDE") || type.equals("DRINK")) {
        // return size + " " + name;
        // }
        // return name;
    }

    // -----------------------------------------------------------------//
    @Override
    public String getName() {
        return super.getName() + " Burger ";
    }

    // -----------------------------------------------------------------//
    @Override
    public double adjuestprice() {
        return getBasePrice() + ((extra1 == null) ? 0 : extra1.adjuestprice())
                + ((extra2 == null) ? 0 : extra2.adjuestprice())
                + ((extra3 == null) ? 0 : extra3.adjuestprice());
    }

    // -----------------------------------------------------------------//
    public double extraprice(String toppingName) {
        return switch (toppingName.toUpperCase()) {
            case "AVOCODE", "CHESSE" -> 1.7;
            case "BACON", "HAM", "SALAM" -> 1.8;
            default -> 0.0;
        };
    }
    // -----------------------------------------------------------------//

    public void addtopping(String extra1, String extra2, String extra3) {
        this.extra1 = new Item("Topping", extra1, extraprice(extra1));
        this.extra2 = new Item("Topping", extra2, extraprice(extra2));
        this.extra3 = new Item("Topping", extra3, extraprice(extra3));
    }

    // ------------------------------------------------------------------------//

    public void printItemizedlist() {
        printitem("base burger", getBasePrice());
        if (extra1 != null) {
            extra1.printitem();

        }
        if (extra2 != null) {
            extra2.printitem();

        }
        if (extra3 != null) {
            extra3.printitem();

        }

    }

    // ---------------------------------------------------------------------//
    @Override
    public void printitem() {
        printItemizedlist();
        System.out.println("-".repeat(30));
        super.printitem();
    }

}