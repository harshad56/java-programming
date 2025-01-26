//FIFO first in first out
import java.util.LinkedList;
import java.util.Queue;

public class main {

    public static void main(String[] args) {

        //so linkedlist is class that implement the Queue interface so linked can used Queue methods
        Queue<Integer> queue = new LinkedList<>();
        queue.add(12);
        queue.add(13);
        queue.add(14);
        //----------------------------------------------

        System.out.println(queue);

        //for deelete
        System.out.println(queue.poll());
        //----------------------------------------------

        System.out.println(queue);

        //for displaying next element for deletion
        System.out.println(queue.peek());
    }
}
