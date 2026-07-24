package java8Features.methodReference;

import java.time.LocalTime;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Method_References {
    public static void main(String[] args) {
        Function<String,String> upper = String::toUpperCase;
        System.out.println(upper.apply("ayan"));

        Consumer<String> print = System.out::println;
        print.accept("Java");

        Predicate<String> empty = String::isEmpty;
        System.out.println(empty.test("don"));

        Supplier<LocalTime> time = LocalTime::now;
        System.out.println(time.get());


    }
}
