package collectionFrameworks;
 /*Generics in Java are a feature that allows classes, interfaces, and methods
  to work with different data types while providing type safety at compile time.

  Before generics, collections could store any type of object, which often
  required explicit type casting and could lead to runtime errors.
 */

import java.util.ArrayList;

class MyClass<T>{                       // Creating our own generic Class
    T value;
    void setValue(T value){
        this.value = value;
    }
    T getValue(){
        return value;
    }
}
public class Generics {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("King");
        System.out.println(a);

        MyClass<Integer> c = new MyClass<>();
        c.setValue(110);
        System.out.println(c.getValue());

    }
}
