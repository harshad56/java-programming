
public class Product {
    private String model;
    private String manufacture;
    private int width;
    private int height;
    private int depth;

    public Product(String M, String m) {
        model = M;
        manufacture = m;

    }

}

/*---------------------------------------------------------------- */
// sub class-1
class Monitor extends Product {
    private int size;
    private String resolution;

    public Monitor(String model, String manufacture, int size, String resolution) {
        super(model, manufacture);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawpixelAt(int x, int y, String color) {
        System.out.println(String.format("drwaing at pixel %d,%d in color %s", x, y, color));
    }

}

// ----------------------------------------------------------//
// sub class-2
class Motherboard extends Product {
    private int ramSlot;
    private int cardslot;
    private String bies;

    public Motherboard(String model, String manufacture, int ramSlot, int cardslot, String bies) {
        super(model, manufacture);
        this.ramSlot = ramSlot;
        this.cardslot = cardslot;
        this.bies = bies;
    }

    public void loadprogram(String program) {
        System.out.println("program" + program + " is loading...");
    }

}

// ----------------------------------------------------------//
// sub class-3
class CompueterCase extends Product {
    private String powersupply;

    public CompueterCase(String model, String manufacture, String powersupply) {
        super(model, manufacture);
        this.powersupply = powersupply;
    }

    public void powerButton() {
        System.out.println("power button pressed");
    }

}
