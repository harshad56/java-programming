
public class smartKitchen extends machine {
    private Refrigertor icebox;
    private Dishwasher dishwasher;
    private Coffeemaker brewmaster;

    public smartKitchen(Refrigertor icebox, Dishwasher dishwasher, Coffeemaker brewmaster, String machinecomapny,
            String madedate) {
        super(machinecomapny, madedate);
        this.icebox = icebox;
        this.dishwasher = dishwasher;
        this.brewmaster = brewmaster;
    }

    public Refrigertor getIcebox() {
        return icebox;
    }

    public Dishwasher getDishwasher() {
        return dishwasher;
    }

    public Coffeemaker getBrewmaster() {
        return brewmaster;
    }

}