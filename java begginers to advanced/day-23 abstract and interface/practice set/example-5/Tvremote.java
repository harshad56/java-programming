/**
 * InnerTvremote
 */
interface smartremote {
    void preespoeron();

    void preespoeroff();

}

interface Tvremote extends smartremote {
    public void preesscreen();

}

class remote implements Tvremote {
    public void preespoeron() {
        System.out.println("Pressing power on");
    }

    public void preespoeroff() {
        System.out.println("Pressing power off");
    }

    public void preesscreen() {
        System.out.println("pressing the screen");
    }
}
