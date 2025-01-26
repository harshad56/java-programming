import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class methods {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>(List.of("apple", "bannana", "youher"));

        ArrayList<String> array = new ArrayList<>(List.of("tea", "tye", "tyu"));
        System.out.println(array);

        /*-------------------------------------------------------- */
        // another to add all arraylist
        data.addAll(array);
        System.out.println(data);

        /*-------------------------------------------------------- */
        // 1)get elements from arralylsit
        System.out.println("third elememt is:" + data.get(2));

        /*-------------------------------------------------------- */
        // 2) contains method
        if (data.contains("tea")) {
            System.out.println("it contains tea");
        }
        /*-------------------------------------------------------- */
        // indexof method,Lastindexof method here arraylist have duplicate value
        data.add("youher");
        System.out.println("first:" + data.indexOf("youher"));
        System.out.println("last:" + data.lastIndexOf("youher"));
        System.out.println(data);

        /*-------------------------------------------------------- */
        // remove,removeall
        data.remove(1);
        // here remove single element at time
        System.out.println(data);

        // but want delete all/or two more, elements you can do this
        data.removeAll(List.of("apple", "tea"));
        System.out.println(data);

        // clear and empty method()
        data.clear();
        System.out.println(data);
        System.out.println("isempty:" + data.isEmpty());
        /*------------------------------------------------- */
        // addAll,aslist methid
        data.addAll(List.of("apple", "bannama"));
        data.addAll(Arrays.asList("eggs", "pickles", "musterd"));
        System.out.println(data);

        /*---------------------------------------------------------- */
        // sort
        data.sort(Comparator.naturalOrder());
        System.out.println(data);
        // reveresorder
        data.sort(Comparator.reverseOrder());
        System.out.println(data);
    }

}
