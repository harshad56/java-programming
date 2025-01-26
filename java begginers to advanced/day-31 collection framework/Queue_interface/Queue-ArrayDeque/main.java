
import java.util.ArrayDeque;

public class main {

    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        queue.offer(23);
        queue.addFirst(12);
        queue.addLast(56);

        System.out.println(queue);
        System.out.println();
        System.out.println("================================");
        //----------------------------------------- 

        System.out.println(queue.peek());
        System.out.println(queue.peekFirst());
        System.out.println(queue.peekLast());
        System.out.println();
        System.out.println("================================");
        //-----------------------------------------

        System.out.println(queue.poll());
        System.out.println("poll()" + queue);
        System.out.println();
        System.out.println("================================");
        //-----------------------------------------

        System.out.println(queue.pollFirst());
        System.out.println("pollFirst()" + queue);
        System.out.println();
        System.out.println("================================");
        //-----------------------------------------

        System.out.println(queue.pollLast());
        System.out.println("pollLast()" + queue);

    }
}
