
import java.util.LinkedList;
import java.util.Scanner;

record Place(String  name,int distance){

}

public class ex1 {
    public static void main(String[] args) {
        LinkedList<Place>palcetovisit=new LinkedList<>();
        Place adelaide=new Place("Adelide", 1345);
        addplace(palcetovisit, adelaide);

        addplace(palcetovisit, new Place("adelide", 1345));
        addplace(palcetovisit, new Place("fsfdsa", 1395));
        addplace(palcetovisit, new Place("tuop", 1305));
        addplace(palcetovisit, new Place("edgu", 1325));

        palcetovisit.addFirst(new Place("sydney",   0));
        System.out.println(palcetovisit);

        var iterator=palcetovisit.listIterator();
        Scanner sc=new Scanner(System.in);
        boolean quitloop=false;
        boolean forward=true;

        printMenu();
        while(!quitloop){
            if(!iterator.hasPrevious()){
                System.out.println("originating:"+iterator.next());
                forward=true;
            }

            if(!iterator.hasNext()){
                System.out.println("final:"+iterator.previous());
                forward=false;
            }
            System.out.println("enter a value:");
            String menuitem=sc.nextLine().toUpperCase().substring(0,1);

            switch(menuitem){
                case "F":
                System.out.println("usre want to go Forward");
                if(iterator.hasNext()){
                    System.out.println(iterator.next());
                }
                break;

                case "B":
                System.out.println("usre want to go Backward");
                if(iterator.hasPrevious()){
                    System.out.println(iterator.previous());
                }
                break;

                case "M":
                printMenu();
                break;

                case "L":
                System.out.println(palcetovisit);
                break;

                default:
                quitloop=true;
                break;
            }
        }
    }


    private static void addplace(LinkedList<Place>list,Place place ){
        if(list.contains(place)){
            System.out.println("found duplicate:"+place);
            return;
        }

        for(Place p:list){
            if(p.name().equalsIgnoreCase(place.name())){
                System.out.println("found duplicate:"+place);
                return;
            }
        }

        int matchedindex=0;
        for(var listplace:list){
            if(place.distance()<listplace.distance()){
                list.add(matchedindex,place);
                return;
            }
            matchedindex++;
        }
        list.add(place);
    }

    private static void printMenu(){
        System.out.println("""
                Aviable actions(select word or letter):
                (F)orward
                (B)ackword
                (L)ist places
                (M)enu
                (Q)uit""");
    }
}
