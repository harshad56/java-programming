
public class defaultmethods {
    public static void main(String[] args) {
        smartphone s = new smartphone();
        s.callnumber(476347656);
        s.takePicture();

        String[] networklist = s.getnetwork();
        for (String network : networklist) {
            System.out.println(network);
        }

        s.record4kvideo();
    }
}
