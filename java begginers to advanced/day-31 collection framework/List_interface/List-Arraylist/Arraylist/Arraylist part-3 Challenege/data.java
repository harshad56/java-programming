
import java.util.ArrayList;
import java.util.Scanner;

public class data {
    Scanner sc=new Scanner(System.in);
    public void printdata(){
        String textBlock="""
                Availble actions

                0-to Stutdown
                1-Add to add items in list(comma delimited list)
                2-Remove any items in list(comma delimited list)
                """;
        System.out.println(textBlock +" ");

    }

    public void addelemets(ArrayList<String> groceries) {
        System.out.println("add items by comma seprated");
        String[] items=sc.nextLine().split(",");

       for(String i:items){
        String trimmed=i.trim();
        if(groceries.indexOf(trimmed)<0){
            groceries.add(trimmed);
        }
       }

    }

    public void removeelemnts(ArrayList<String> groceries){
        System.out.println("remove items by comma seprated");
        String[] item=sc.nextLine().split(",");

        for(String i:item){
        String trimmed=i.trim();
        groceries.remove(trimmed);
        
       }
    }
 
}
