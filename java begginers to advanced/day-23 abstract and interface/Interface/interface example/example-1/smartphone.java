// inheterface1
interface camera {
    void takePicture();

    void takevideo();

    // here we talk deafult method ,when create interfcae and implemt in class it
    // works ,but when we add new method in interface it show error of implement
    // method in sub class complusory
    // example we create website like interfcae using subclasses when we add new
    // method in interface then you need complusory defined method in subclass ,so
    // it going repetinaly,so
    // we use default method in interface
    // ex-
    default void record4kvideo() {
        System.out.println("recording 4k video");
    }// using defaulot methods no need implement methods repeatly
}

// inheterface2
interface wifi {
    String[] getnetwork();

    void connecttoNetwork(String Network);
}

/*---------------------------------------------------------------- */
// class
class cellphone {
    void callnumber(int phonenumber) {
        System.out.println("calling " + phonenumber);
    }

    void pickcall() {
        System.out.println("connecting..");
    }
}

/*------------------------------------------------------------------ */
// their are using following class like this according that image
class smartphone extends cellphone implements camera, wifi {

    public void takePicture() {
        System.out.println("taking picture");
    }

    public void takevideo() {
        System.out.println("taking video");
    }

    public String[] getnetwork() {
        System.out.println("getting lsit of networks");
        String[] networklist = { "hary", "barr5y" };
        return networklist;
    }

    public void connecttoNetwork(String Network) {
        System.out.println("connecting to network");
    }

    // and extends class in subclass their no need defined here you want change
    // fuctionlity then you can aslo defined here

    // you can aslo override the defaulot methods
    public void record4kvideo() {
        System.out.println("recording 4k video in 4pixel");
    }
}
