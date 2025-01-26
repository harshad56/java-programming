
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- 
        ///ex1 for wrapper classes
        Integer[] wrapperarray = new Integer[5];//Integer is wrapper class,other wrapper class is Chared wrapper,float wrapper etc
        wrapperarray[0] = 50;
        System.out.println(Arrays.toString(wrapperarray));

        // -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- 
        //ex2 for wrapper classes
        Character[] ex = {'a', 'b', 'c'};
        System.out.println(Arrays.toString(ex));

        var ourList = getlist(1, 2, 3, 4, 6);
        System.out.println(ourList);
    }

    //one way to get autoboxing //Integer in ArrayList vaiable aList
    private static ArrayList<Integer> getlist(int... varargs) {
        ArrayList<Integer> aList = new ArrayList<>();
        for (int i : varargs) {
            aList.add(i);

        }
        return aList;
    }

    private static int returnInt(Integer i) {
        return i;
    }

    private static Integer returnInteger(int i) {
        return i;
    }

}
