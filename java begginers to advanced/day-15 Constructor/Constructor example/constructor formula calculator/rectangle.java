
public class rectangle {
    private int lenght;// it instance varaible,decalring the instance vairable static keyword not used
                       // methods
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

    // it instance method
    public int getLenght() {
        return lenght;
    }

    // it instance method
    public int getBreadth() {
        return breadth;
    }

    // it instance method
    public void recatnglearea() {
        System.out.println("area of reactangle is:" + lenght * breadth);
    }

}
