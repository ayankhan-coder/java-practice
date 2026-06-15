package collectionFrameworks;
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque_ {
    public static void main(String[] args) {

        /*Array Deque*/
        Deque<Integer> ad = new ArrayDeque<>();
        ad.add(10);
        ad.add(30);
        ad.addFirst(50);
        ad.addLast(60);
        ad.removeLast();
        ad.removeFirst();
        System.out.println(ad.peekFirst());
        for (int element : ad){
            System.out.println(element);
        }
    }
}
