
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        boolean flag=true;
        ArrayList<String> groceries=new ArrayList<>();
        while(flag){
            data d=new data();
            d.printdata();
            switch (Integer.parseInt(sc.nextLine())) {
                case 1:
                d.addelemets(groceries);
                break;

                case 2:
                d.removeelemnts(groceries);
                break;
                
                default:
                flag=false;
                 
            }

            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
    }
}
