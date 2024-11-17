
public class Constructor {
    public static void main(String[] args) {
        // Mymainemployee mymainemployee=new Mymainemployee();//when not argumets passed
        // it check constructor method they have value it take

        Mymainemployee mymainemployee = new Mymainemployee(12, "harshad");// here pased arguments myname for the
                                                                          // constructor method(in Mymainemployee class)

        System.out.println(mymainemployee.getId());
        System.out.println(mymainemployee.getName());

    }
}

class Mymainemployee {
    private int id;
    private String name;

    // we can aslo method overloading do with constructor methods
    public Mymainemployee(String myname) {
        // and dont add static and return type in constructor
        // also constructor name and class file is same complusory

        id = 41;
        name = myname;
    }

    public Mymainemployee(int mainid, String myname) {
        // also constructor name and class file is same complusory
        // it is a constructor,you can aslo passed parmetrs like
        id = mainid;
        name = myname;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(int n) {
        id = n;
    }

    public int getId() {
        return id;
    }
}
