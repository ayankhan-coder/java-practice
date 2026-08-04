package java8Features;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

class Employee{
    String name;
    double salary;
    int id;

    public Employee(String name, double salary,int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + ":"+name+":"+salary;
    }
}

public class ComparatorWithReference {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("zayan",50000,9));
        employees.add(new Employee("ayan",50000,8));
        employees.add(new Employee("sam",80000,5));

        Comparator<Employee> comparator = Comparator.comparing(Employee::getName); //Comparing
        Collections.sort(employees,comparator);

        employees.sort(Comparator.comparing(Employee::getName));
        System.out.println(employees);

        employees.sort(Comparator.comparing(Employee::getName).reversed());        //reversed
        System.out.println(employees);

        employees.sort(Comparator.comparingInt(Employee::getId).reversed());       //comparingInt
        System.out.println(employees);


        employees.sort(
                Comparator.comparingDouble(Employee::getSalary)                   //comparingDouble
                        .thenComparing(Employee::getId)                           // thenComparing
        );
        System.out.println(employees);

        employees.sort(
                Comparator.comparingDouble(Employee::getSalary).reversed()
                        .thenComparing(Employee::getId)
        );
        System.out.println(employees);

    }
}
