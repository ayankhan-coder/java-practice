package java8Features.methodReference.typesMethodReference;


import java.util.function.Function;
import java.util.function.Supplier;

class Student1{
    String name;
    Student1(){
        System.out.println("Student Created");
    }
    Student1(String name){
        this.name = name;
        System.out.println(name);
    }


}
public class ConstructorReference {
    public static void main(String[] args) {

        Supplier<Student1> supplier = Student1::new;
        supplier.get();

        Function<String,Student1> function = Student1::new;
        function.apply("Harsh");

    }
}
