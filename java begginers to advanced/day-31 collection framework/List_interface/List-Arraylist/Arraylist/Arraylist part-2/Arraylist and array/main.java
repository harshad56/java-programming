
import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        String[] arraylsit = {"first", "second", "third"};
        var orginallist = Arrays.asList(arraylsit);

        orginallist.set(0, "one");
        System.out.println("orininal list:" + orginallist);
        System.out.println("array:" + Arrays.toString(arraylsit));

        //but you see eralier list are not resizable so it cant change like add method,remove method
    }
}
