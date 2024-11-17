//q-4:-Create a class Tele Phone with ring(), lifte
//and disconnect () methods as abstract methods.
//Create another class Smart Telephone and demonstrate
//polymorphism

public abstract class Telephone {
    abstract void ring();

    abstract void lift();

    abstract void disconnect();

}

/**
 * InnerTelephone
 */
interface Musicplayer {
    void playmusic();

    void stopmusic();

}

class Smartphone extends Telephone implements Musicplayer {

    @Override
    public void ring() {
        System.out.println("phone is ringing");
    }

    @Override
    public void lift() {
        System.out.println("phone is lift");
    }

    @Override
    public void disconnect() {
        System.out.println("phone is disconcted");
    }

    public void playmusic() {
        System.out.println("playing a music");
    }

    public void stopmusic() {
        System.out.println("stop the music");
    }

}
