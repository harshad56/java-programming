
public class machine {
    private String machinecomapny;
    private String madedate;
    private int price;

    public machine(String machinecomapny, String madedate) {
        this.machinecomapny = machinecomapny;
        this.madedate = madedate;

    }

}

class Refrigertor extends machine {
    private boolean hasworktodo;

    public Refrigertor(String machinecomapny, String madedate) {
        super(machinecomapny, madedate);

    }

    public Refrigertor(String machinecomapny, String madedate, boolean hasworktodo) {
        super(machinecomapny, madedate);
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

class Dishwasher extends machine {
    private boolean hasworktodo;

    public Dishwasher(String machinecomapny, String madedate) {
        super(machinecomapny, madedate);

    }

    public Dishwasher(String machinecomapny, String madedate, boolean hasworktodo) {
        super(machinecomapny, madedate);
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

class Coffeemaker extends machine {
    private boolean hasworktodo;

    public Coffeemaker(String machinecomapny, String madedate) {
        super(machinecomapny, madedate);

    }

    public Coffeemaker(String machinecomapny, String madedate, boolean hasworktodo) {
        super(machinecomapny, madedate);
        this.hasworktodo = hasworktodo;
    }

    public void brewcoffe() {
        if (hasworktodo) {
            System.out.println("mading cofee");
            hasworktodo = false;
        }
    }

}