import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class Main {

    public static void main(String[] args) {
        // here we see normal data add in array
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

        // here we see data add in arraylist but type is not included
        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        // here is proper presention of arraylist with type
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("buda", "fggd", 2));
        groceryList.add(new GroceryItem("hjsh", "hdhsa", 6));

        // when you want add data at specific index so you can write this
        groceryList.add(1, new GroceryItem("bannna", "fd", 2));

        // remove method
        groceryList.remove(0);
        System.out.println(groceryList);
    }
}
