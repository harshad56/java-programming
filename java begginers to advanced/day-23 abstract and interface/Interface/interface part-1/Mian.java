public class Mian {
    public static void main(String[] args) {
        Avoncycle a = new Avoncycle();
        a.addbrake(1);
        System.out.println(a.avairble); // you can create a properties in interface

        // You cannot modify the properties in Interfaces as they are final
        // a.avairble = 10; // this will give an error

    }
}