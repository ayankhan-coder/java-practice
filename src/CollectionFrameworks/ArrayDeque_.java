package CollectionFrameworks;

public class ArrayDeque_ {
    public static void main(String[] args) {
        /*Array Deque*/
        java.util.ArrayDeque<Integer> ad = new java.util.ArrayDeque<>();
        ad.add(10);
        ad.add(30);
        ad.removeLast();
        System.out.println(ad.peekFirst());
    }
}
