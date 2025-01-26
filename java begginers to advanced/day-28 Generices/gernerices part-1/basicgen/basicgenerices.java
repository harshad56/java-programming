package dev.lpa;

import java.util.*;

class genercies<T1, T2> {//and also  in generices you can create multiple class types like T1, T2

    int val;
    private T1 t1;//so we it for string
    private T2 t2;//so we it for int like this 

    public genercies(int val, T1 t, T2 t2) {
        this.val = val;
        this.t1 = t;
        this.t2 = t2;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT() {
        return t1;
    }

    public void setT(T1 t) {
        this.t1 = t;
    }

}

public class basicgenerices {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        // here we cant write int breacause int int is primitive data type
        //a.add("harshad");//it string it can not convete d to string
        a.add(2);

        int no = a.get(2);
        //here error beacause the object cannot to int so we can also type casting do but we use genercies like ex

        genercies<String, Integer> g1 = new genercies<>(12, "harshad", 67);
        String str = g1.getT();
        System.out.println(str);

        int val = g1.getT2();
        System.out.println(val);

        genericemethod("gsqhg");

    }

    //also we can create generices method without class like this
    public static <E> void genericemethod(E data) {
        System.out.println(data);
    }
}
