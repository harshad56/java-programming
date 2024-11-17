import java.util.ArrayList;
import java.util.List;

public class Morelist {
    public static void main(String[] args) {
        String[] items = { "apple", "banna", "milk" };

        // convert the array sting to list of string
        List<String> list = List.of(items);
        System.out.println(list);
        /*-------------------------------------------------------------- */

        // but list get problem of immutable list means they cannot change ex
        // list.add("ggg");it get error beacuse of its not change size
        /*-------------------------------------------------------------- */

        // thats why we used arraylist instead of list

        ArrayList<String> groceryiltm = new ArrayList<>(list);
        groceryiltm.add("apple1");
        System.out.println(groceryiltm);
        /*-------------------------------------------------------------- */

        // create a new arraylist like this
        ArrayList<String> array = new ArrayList<>(List.of("tea", "tye", "tyu"));
        System.out.println(array);
        /*-------------------------------------------------------------- */

    }
}
