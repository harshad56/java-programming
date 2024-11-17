
import java.util.LinkedList;
import java.util.ListIterator;

public class linklist {
    public static void main(String[] args) {
        LinkedList<String> palceelment=new LinkedList<>();
        //var placeelement=new LinkedList<String>()

        palceelment.add("harshad");
        palceelment.add("karan");
        addmoreelements(palceelment);
        System.out.println(palceelment);

        // removelement(palceelment);
        // System.out.println(palceelment);
        
        //gettingelements(palceelment);

       // printtinery(palceelment);

        //printtinery2(palceelment);
        testiterator(palceelment);
    }
    public static void addmoreelements(LinkedList<String> list){
        list.add("raju");
        list.add("raui");
        list.add("raui");

        //queue method
        list.offer("praju");//it add data end of list
        list.offerFirst("kalu");
        list.offerLast("balu");

        //stack methods
        list.push("Alice springs");//it push the data at head of list
    }

    public static void removelement(LinkedList<String>list){
        list.remove(4);
        list.remove("balu");

        //more remove methods
        String s1= list.remove();//remove first element
        System.out.println(s1+" was removed");

        String s2= list.removeFirst();//remove first element
        System.out.println(s2+" was removed");

        String s3= list.removeLast();//remove first element
        System.out.println(s3+" was removed");

        
    }

    public static void gettingelements(LinkedList<String>list){
        System.out.println("retive elements:"+list.get(4));

        System.out.println("first Element="+list.getFirst());

        System.out.println("last Element="+list.getLast());

        System.out.println("prajhu is position:"+list.indexOf("praju"));

        System.out.println("raui is position:"+list.lastIndexOf("raui"));

        //queue reterivel method
        System.err.println("elements from element()"+list.element());
        //Stack reterivel methods
        System.out.println("peek element="+list.peek());

        System.out.println("peek element from peekfirst:="+list.peekFirst());
        System.out.println("peek element from peeklast:"+list.peekLast());
    }
    
    public static void printtinery(LinkedList<String>list){

        System.out.println("placememt start at:"+list.getFirst());
        for(int i=0;i<list.size()-1;i++){
            System.out.println("placement start at: "+list.get(i)+"->plavement end at: "+list.get(i+1));
        }
        System.out.println("placemnt ends at"+list.getLast());
/*----------------------------------------------------------------------------------- */
        //you can also use for each loop
        System.out.println("------------using for each loop-----------------");
        String prevoiusplacemnt=list.getFirst();
        for(String p:list){
            System.out.println("placement start at:" +prevoiusplacemnt+"->p"+p);
        //but it has limition on firstindex print two position at time so we use iterators
    }


    }
/*----------------------------------------------------------------------------------- */
    //ierators
    //itertor have two type:-iterator,listiterator
    public static void printtinery2(LinkedList<String>list){
        String prevoiusplacemnt=list.getFirst();
        ListIterator<String> iterator=list.listIterator(
            1);

        while(iterator.hasNext()){
            var last=iterator.next();
            System.out.println("placement start at:" +prevoiusplacemnt+"->nextplacemet->"+last);
            prevoiusplacemnt=last;
        }
    }
    /*--------------------------------------------------------------------------------- */
    //iterator
    private static void testiterator(LinkedList<String>list){
        var iterator=list.listIterator();
        
        while(iterator.hasNext()){
            //System.out.println(iterator.next());
            if(iterator.next().equals("raju")){
                //iterator.remove();
                iterator.add("magu");
                //if we use list instead of iterator object it show error beacuse the listiterator give chance to remove,add
            }
        }
        System.out.println(list);
    }
}
