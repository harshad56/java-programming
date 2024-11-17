
public class DetectDoubleandTripleSpace {
    public static void main(String[] args) {
        String str = "Hello World!   How are you today?I am fine,thank";
        System.out.println(str.indexOf("  "));// check for Double Space//12
        System.out.println(str.indexOf("   "));// check for Triple Space//12

        // when they have double or triple space it returns its index no where it first
        // finded position
        // but they dont have double or triple space it returns -1
    }
}
