
public class Main {
    public static void main(String[] args) {
        Refrigertor ref = new Refrigertor("tello", "11/12/1003", true);

        Dishwasher dish = new Dishwasher("zello", "11/12/1003", true);

        Coffeemaker cofee = new Coffeemaker("yello", "11/12/1003", true);

        smartKitchen kitchen = new smartKitchen(ref, dish, cofee, "   BABACOM", "12/7/1007");

        kitchen.getIcebox().orderfood();
        kitchen.getDishwasher().dodishes();
        kitchen.getBrewmaster().brewcoffe();
    }
}
