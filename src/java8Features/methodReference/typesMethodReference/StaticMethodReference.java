package java8Features.methodReference.typesMethodReference;

/*A static method reference is a shorthand way to refer to a static method so it can be used
where a functional interface is expected. It makes your code shorter and often easier to
read than using a lambda expression.*/

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Maths{
    static void print(int number){
        System.out.println(number);
    }
    static int multiply(int number){
        return number * number;
    }
    static boolean is10(int number){
        return number == 10;
    }
    static int number(){
        return 1010;
    }
}
public class StaticMethodReference {

    public static void main(String[] args) {

        Consumer<Integer> c = Maths::print;
        c.accept(10);

        Function<Integer,Integer> function = Maths::multiply;
        System.out.println(function.apply(10));

        Predicate<Integer> predicate = Maths::is10;
        System.out.println(predicate.test(20));

        Supplier<Integer> supplier = Maths::number;
        System.out.println(supplier.get());

    }
}
