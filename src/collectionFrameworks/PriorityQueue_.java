package collectionFrameworks;
/*Priority Queue is a Queue Implementation that serves element according to their priority
instead of insertion order
smaller number = high priority
alphabetic order = a = high z = low
 */
import java.util.PriorityQueue;

public class PriorityQueue_ {
    public static void main(String[] args) {

        PriorityQueue<String> p1 = new PriorityQueue<>();
        PriorityQueue<Integer> p2 = new PriorityQueue<>();
        p1.add("ramesh");
        p1.add("anda");
        System.out.println(p1);
        p2.add(20);
        p2.add(10);
        System.out.println(p2);
        System.out.println(p1.peek());
        System.out.println(p2.peek());
        System.out.println(p2.remove());

    }
}
