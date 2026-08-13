package java8Features.methodReference.typesMethodReference;

/* Reference to an instance method of a particular object*/

/*a reference to an instance method of a particular object is a type of
method reference where the method is called on a specific object that already exists.
 */

import java.util.function.Function;
import java.util.function.Predicate;

import java.util.function.Consumer;
import java.util.function.Supplier;

class Printer{
    void print(String text){
        System.out.println(text+" printing ....");
    }
}

class AdultCheck{
    boolean isAdult(int age){
        return age >= 18;
    }
}

class TextConverter{
    String convert(String text){
       return text.toUpperCase();
    }
    String print(){
        return "hello Ayan";
    }
}
public class InstanceParticularObject {
    public static void main(String[] args) {

        Printer printer = new Printer();             // Particular Object
        Consumer<String> consumer = printer::print;
        consumer.accept("Pdf");

        AdultCheck adultCheck = new AdultCheck();
        Predicate<Integer> predicate = adultCheck::isAdult;
        System.out.println(predicate.test(18));

        TextConverter ayan = new TextConverter();
        Function<String,String> function = ayan::convert;
        System.out.println(function.apply("ayandon"));

        Supplier<String> supplier = ayan::print;
        System.out.println(supplier.get());


    }
}
