package java8Features.functionalinterfaces;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperator_Interface {
    public static void main(String[] args) {

        Function<Integer,Integer> function = num -> num * num;
        System.out.println(function.apply(10));

        UnaryOperator<Integer> unaryOperator = num -> num * num;
        System.out.println(function.apply(10));

        UnaryOperator<String> upper = String::toUpperCase;
        System.out.println(upper.apply("ayan"));

        UnaryOperator<String> username = text ->text.toLowerCase().trim();
        System.out.println(username.apply(" AyAN_9 "));


        System.out.println("--------------------Methods-------------------------");
        /*Methods apply, andThen, compose, */

        UnaryOperator<Integer> doubleNumber = number -> number * 2;             //andThen
        UnaryOperator<Integer> addTen = number -> number + 10;
        Function<Integer, Integer> result = doubleNumber.andThen(addTen);
        System.out.println(result.apply(5));

        Function<Integer, Integer> result2 = doubleNumber.compose(addTen);            //Compose
        System.out.println(result.apply(5));

    }
}
