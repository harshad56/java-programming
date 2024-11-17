
public class Room {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Lamp lamp;
    private Bed bed;
    private Ceiling celing;

    public Room(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Lamp lamp, Bed bed, Ceiling celing) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.lamp = lamp;
        this.bed = bed;
        this.celing = celing;
    }

    // getters----------------------------
    public String getName() {
        return name;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Bed getBed() {
        return bed;
    }

    public Ceiling getCeling() {
        return celing;
    }

    // getters----------------------------

}

/*----------------------------------------------------------------- */
class Wall {
    private String direction;

    public Wall(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

}
// ------------------------------------------------//

class Lamp {
    private String Style;
    private boolean battery;
    private int globrating;

    public Lamp(String style, boolean battery, int globrating) {
        this.Style = style;
        this.battery = battery;
        this.globrating = globrating;
    }

    public void turnon() {
        System.out.println(" lamp is being turned on");
    }

    public String getStyle() {
        return Style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globrating;
    }

}
// ------------------------------------------------//

class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;

    }

    public void make() {
        System.out.println("the effect lamp is made");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }

}
// ------------------------------------------------//

class Ceiling {
    private int height;
    private int paintedColor;

    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }

}
// ------------------------------------------------//
