package collectionFrameworks;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_ {
    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();
        q.add("ayan");
        q.add("ahmed");
        q.add("khan");
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.element());
        q.offer("ramesh");
        System.out.println(q);
        for (String element :q){
            System.out.println(element);
        }







    }
}
