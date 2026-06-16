package collectionFrameworks;
/*TreeSet is a Set implementation that stores unique elements
in sorted order*/

import java.util.TreeSet;

public class TreeSet_ {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(20);
        System.out.println(treeSet);
        treeSet.pollFirst();
        treeSet.remove(20);
        for (int el : treeSet){
            System.out.println(el);
        }
    }
}
