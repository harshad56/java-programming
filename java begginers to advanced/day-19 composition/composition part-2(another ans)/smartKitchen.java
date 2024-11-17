
public class smartKitchen {
    private Refrigertor icebox;// you can get clases like this when you want multiple inhetence so use
                               // compostion like this
    private Dishwasher dishwasher;
    private Coffeemaker brewmaster;

    public smartKitchen() {
        icebox = new Refrigertor(true);
        dishwasher = new Dishwasher(true);
        brewmaster = new Coffeemaker(true);

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

    // do multiple work in one method like this
    public void kitchenwork() {
        brewmaster.brewcoffe();
        icebox.orderfood();
        dishwasher.dodishes();
    }

}

/*-------------------------------------------------------------- */
class Refrigertor {
    private boolean hasworktodo;

    public Refrigertor(boolean hasworktodo) {
        this.hasworktodo = hasworktodo;
    }

    public void orderfood() {
        if (hasworktodo) {
            System.out.println("order is places");
            hasworktodo = false;
        }
    }
}
// --------------------------------------------------------//

class Dishwasher {
    private boolean hasworktodo;

    public Dishwasher(boolean hasworktodo) {
        this.hasworktodo = hasworktodo;
    }

    public void dodishes() {
        if (hasworktodo) {
            System.out.println("dihes are cleaning");
            hasworktodo = false;
        }
    }
}

// --------------------------------------------------------//

class Coffeemaker {
    private boolean hasworktodo;

    public Coffeemaker(boolean hasworktodo) {
        this.hasworktodo = hasworktodo;
    }

    public void brewcoffe() {
        if (hasworktodo) {
            System.out.println("mading cofee");
            hasworktodo = false;
        }
    }
}
