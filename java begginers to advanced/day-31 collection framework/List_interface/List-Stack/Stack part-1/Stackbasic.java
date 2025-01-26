//LIFO last in first out

import java.util.Stack;

public class Stackbasic {

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("harshad");
        s.push("sagar");
        s.push("kumar");
        //----------------------------------------------------------------
        System.out.println("names" + s);
        System.out.println(s.peek());//display the top element in stack

        //delete the top element in stack
        s.pop();

        System.out.println("names" + s);
        System.out.println(s.peek());

        //add elements to the stack
        s.push("ragu");

        System.out.println(s.empty());//check empty or not;
        System.out.println(s);

    }

}
