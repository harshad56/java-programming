
public class rectangle {
    private int lenght;
    private int breadth;

    // default values
    public rectangle() {
        lenght = 4;
        breadth = 5;
    }

    // when value pasased in instance line this code exectuted
    public rectangle(int l, int b) {
        this.lenght = l;
        this.breadth = b;
    }

    public int getLenght() {
        return lenght;
    }

    public int getBreadth() {
        return breadth;
    }

}
