package java8Features;

import java.util.*;

import java.util.List;

class Student{
    String name;
    int marks;
    int rollNum;

    public Student(String name, int marks,int rollNum) {
        this.name = name;
        this.marks = marks;
        this.rollNum = rollNum;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public int getRollNum() {
        return rollNum;
    }
}

public class ComparatorWithLambda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Student> students = new ArrayList<>();
        students.add(new Student("ayan",52,9));
        students.add(new Student("zakmal",40,26));
        students.add(new Student("hussain",690,8));

        Comparator<Student> comparator = (s1,s2) -> Integer.compare(s2.marks,s1.marks);//ComparatorStoredInVariable
        Collections.sort(students,comparator);
        for (Student student: students){
            System.out.println(student.rollNum+"-"+student.name+"-"+student.marks);
        }



        while (true){
            System.out.println("1-SortByRoll 2-SortMarks 3-SortNameA-Z 4-SortNameZ-A ");
            System.out.print("Enter the Option : ");
            int choice  = sc.nextInt();

            switch (choice){
                case 1:
                    students.sort((r1,r2) -> Integer.compare(r1.rollNum,r2.rollNum)); //InLineComparator
                    for (Student student: students){
                        System.out.println(student.rollNum+"-"+student.name+"-"+student.marks);
                    }
                    break;
                case 2:
                    students.sort((m1,m2) -> Integer.compare(m2.marks,m1.marks) );
                    for (Student student: students){
                        System.out.println(student.rollNum+"-"+student.name+"-"+student.marks);
                    }
                    break;
                case 3:
                    students.sort((s1,s2) -> s1.name.compareTo(s2.name));    // Comparable+Comparator
                    for (Student student: students){
                        System.out.println(student.rollNum+"-"+student.name+"-"+student.marks);
                    }
                    break;

                case 4:
                    students.sort((s1,s2) -> s2.name.compareTo(s1.name));
                    for (Student student: students){
                        System.out.println(student.rollNum+"-"+student.name+"-"+student.marks);
                    }
                    break;

            }
        }
    }
}
