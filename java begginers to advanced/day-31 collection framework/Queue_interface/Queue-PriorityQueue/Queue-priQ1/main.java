
import java.util.*;

public class main {

    public static void main(String[] args) {
        //for mean heap
        Queue<Integer> queue = new PriorityQueue<>();

        queue.offer(5);
        queue.offer(3);
        queue.offer(8);
        //it goest increasing order print ,means it also called meanheap
        System.out.println(queue);

        queue.poll();// delete the first element set next elemrnt as first element like priorty
        System.out.println(queue);
        System.out.println();

        //--------------------------------------------------//
        //for max heap
        Queue<Integer> queue1 = new PriorityQueue<>(Comparator.reverseOrder());

        queue1.offer(10);
        queue1.offer(3);
        queue1.offer(8);
        //it goest increasing order print ,means it also called meanheap
        System.out.println(queue1);

        queue1.poll();// delete the first element set next elemrnt as first element like priorty
        System.out.println(queue1);
    }
}
