package java8Features.methodReference.typesMethodReference;

/*A reference to an instance method of an arbitrary object of a particular type is a Java method reference
that refers to an instance method of a class without specifying a particular object.
Instead, the object on which the  method is invoked is supplied later when the method reference is executed.*/


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Car{
    String getBrand(){
        return "BMW";
    }
}
class Student{
    boolean isPass(){
        return true;
    }
}
class Xerox{
    void print(){
        System.out.println("Printing");
    }
}


public class instanceArbitaryobject {
    public static void main(String[] args) {

        Function<Car,String> function = Car::getBrand;
        System.out.println(function.apply(new Car()));    //Object is supplied later

        Predicate<Student> predicate = Student::isPass;
        System.out.println(predicate.test(new Student()));

        Consumer<Xerox> consumer = Xerox::print;
        consumer.accept(new Xerox());

        Function<String,String> function1 = String::toUpperCase;
        System.out.println(function1.apply("khan"));






    }
}
