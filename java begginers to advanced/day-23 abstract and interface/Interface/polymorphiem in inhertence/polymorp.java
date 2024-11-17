
public class polymorp {
    public static void main(String[] args) {
        camera cam1 = new smartphone();// here use camera from smartphone
        // here camera as refernce and smartphone is object
        // means it is a smartphone but use as camera
        // you can use cam methods
        cam1.record4kvideo();

        wifi w = new smartphone();// here use wifi from smartphone
        // here wifi as refernce and smartphone is object
        // means it is a smartphone but use as wifi
        // you can use wifi methods
        w.connecttoNetwork(null);
    }
}

/*---------------------------------------------------------------- */
// inheterface1
interface camera {
    void takePicture();

    void takevideo();

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

    // you can aslo override the defaulot methods
    public void record4kvideo() {
        System.out.println("recording 4k video in 4pixel");
    }
}
