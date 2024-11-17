public class Item {
    private String type;
    private String name;
    private String size = "MEDIUM";
    private double price;

    public Item(String type, String name, double price) {
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();

        this.price = price;
    }

    // --------------------------------------------------------------------//
    public String getName() {
        if (type.equals("SIDE") || type.equals("DRINK")) {
            return size + " " + name;
        }
        return name;
    }

    // --------------------------------------------------------------------//
    public double getBasePrice() {
        return price;
    }

    // --------------------------------------------------------------------//
    public double adjuestprice() {
        return switch (size) {
            case "SMALL" -> getBasePrice() - 0.9;
            case "LARGE" -> getBasePrice() + 1;

            default -> getBasePrice();
        };
    }

    public void setsize(String size) {
        this.size = size;

    }

    // -------------------------------------------------------------------//
    public static void printitem(String name, double price) {
        System.out.printf("%20s:%6.2f %n", name, price);
    }

    // --------------------------------------------------------------------//
    public void printitem() {
        printitem(getName(), adjuestprice());
    }

    // --------------------------------------------------------------------//

}
