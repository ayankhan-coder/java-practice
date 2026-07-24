package java8Features;

import java.util.function.Consumer;

class Student{
    String name;

    public Student(String name) {
        this.name = name;
    }
}

public class Consumer_Interface {
    public static void main(String[] args) {

        Consumer<String> printName = name -> System.out.println(name);
        printName.accept("ayan");

        Consumer<Integer> printNumber = num -> System.out.println(num);
        printNumber.accept(100);

        Consumer<Student> printStudent = student -> System.out.println(student.name);
        Student s = new Student("ayan");
        printStudent.accept(s);

        Consumer<String> upperCase = text -> System.out.println(text.toUpperCase());
        upperCase.accept("robot");

        System.out.println("--------------------Methods-------------------------");
        /*Methods accept, andThen, */

        Consumer<String> greet = name -> System.out.println("Hello "+name);
        Consumer<String> welcome = name -> System.out.println("Welcome to Java");
        Consumer<String> result = greet.andThen(welcome);                                 // andThen Method
        result.accept("ramesh");








    }
}
