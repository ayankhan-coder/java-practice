package collectionFrameworks;

import java.util.Stack;

public class Stack_ {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.println(stack.isEmpty());
        stack.push("khan");
        stack.push("suresh");
        stack.push("ramesh");
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.indexOf("ramesh"));
        stack.add("anda");
        System.out.println(stack);
        System.out.println(stack.search("ramesh"));

    }
}
