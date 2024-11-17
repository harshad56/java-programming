
import java.util.LinkedList;
import java.util.ListIterator;

public class iterator {

    public static void main(String[] args) {
        LinkedList<String> palceelment = new LinkedList<>();

        palceelment.add("harshad");
        palceelment.add("karan");
        addmoreelements(palceelment);
        System.out.println(palceelment);

        testiterator(palceelment);
    }

    public static void addmoreelements(LinkedList<String> list) {
        list.add("raju");
        list.add("raui");
        list.add("raui");

    }

    public static void removelement(LinkedList<String> list) {
        list.remove(4);
        list.remove("balu");

    }

    public static void printtinery(LinkedList<String> list) {

        System.out.println("placememt start at:" + list.getFirst());
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.println("placement start at: " + list.get(i) + "->plavement end at: " + list.get(i + 1));
        }
        System.out.println("placemnt ends at" + list.getLast());

        /*-------------------------------------------------------------------- */
        //you can also use for each loop
        System.out.println("------------using for each loop-----------------");
        String prevoiusplacemnt = list.getFirst();
        for (String p : list) {
            System.out.println("placement start at:" + prevoiusplacemnt + "->p" + p);
            //but it has limition on firstindex print two position at time so we use iterators
        }

    }

    /*-------------------------------------------------------------------- */
    //ierators
    //itertor have two type:-iterator,listiterator
    public static void printtinery2(LinkedList<String> list) {
        String prevoiusplacemnt = list.getFirst();
        ListIterator<String> iterator = list.listIterator(
                1);//1)declereation

        while (iterator.hasNext()) {
            //checking for elements has availble
            var last = iterator.next();//next element in list
            System.out.println("placement start at:" + prevoiusplacemnt + "->nextplacemet->" + last);
            prevoiusplacemnt = last;
        }
    }

    /*---------------------------------------------------------------- */
    //iterator
    private static void testiterator(LinkedList<String> list) {
        var iterator = list.listIterator();//on direct list applay iteator

        while (iterator.hasNext()) {
            //System.out.println(iterator.next());
            if (iterator.next().equals("raju")) {
                //iterator.remove();
                iterator.add("magu");
                //if we use list instead of iterator object it show error beacuse the listiterator give chance to remove,add
            }
        }

        //check for previous
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());

        }
        System.out.println(list);

        var iteator2 = list.listIterator(2);
        System.out.println(iteator2.next());

    }
}
