package java8Features.streamApi;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
class Student{
    private String name;
    private int rollNum;
    private int marks;

    public Student(String name, int rollNum,int marks) {
        this.name = name;
        this.rollNum = rollNum;
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    public int getRollNum() {
        return rollNum;
    }
    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return rollNum + ":"+name;
    }
}
public class Stream_Api {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ayan",9,87));
        students.add(new Student("Harry",11,65));
        students.add(new Student("Suresh",10,32));

        List<String> names = List.of("Ayan","Mazhar","Khan","Harry","Khan");

        List<Integer> numbers = List.of(10,50,80,10,60,90,30);
        System.out.println(numbers);

        numbers.stream()
                .filter(num -> num > 30)                    // filter
                .forEach(System.out::println);

        System.out.println(names);
        names.stream()
                .filter(n-> n.length() > 4)
                .map(String::toUpperCase)                            // map
                .forEach(System.out::println);

        List<Integer> numList =
        numbers.stream()
                .filter(num -> num > 30)
                .collect(Collectors.toList());                      // toList
        System.out.println(numList);

        numbers.stream()
                .sorted()                                           // sorted
                .forEach(System.out::println);

        numbers.stream()
                        .sorted(Comparator.reverseOrder())
                        .forEach(System.out::println);

        students.stream()
                .sorted(Comparator.comparingInt(Student::getRollNum).reversed())    // sorted in reverse
                .forEach(student -> System.out.println(student.getRollNum()));

        numbers.stream()
                .distinct()                                           // distinct
                .forEach(System.out::println);

        System.out.println(names);
        names.stream()
                .distinct()
                .forEach(System.out::println);

        students.stream()
                .sorted(Comparator.comparingInt(Student::getRollNum))
                .limit(2)                                     // limit
                .forEach(System.out::println);

        numbers.stream()
                .skip(5)                                          // skip
                .forEach(System.out::println);

        long passedStudents = students.stream()
                .filter(s->s.getMarks() >= 75)
                .count();                                           // count
        System.out.println(passedStudents);

        long count = names.stream()
                .filter(n-> n.startsWith("A"))
                .count();
        System.out.println(count);

        Optional<Integer> smallest =
                numbers.stream()
                        .min(Integer::compare);                     // min
        System.out.println(smallest);

        Optional<Student> largest =
                students.stream()                                  // max
                        .max(Comparator.comparingInt(Student::getMarks));
        System.out.println(largest);

        Optional<String> first =
                names.stream()
                        .findFirst();                             // findFirst
        System.out.println(first);

        Optional<Student> find =
                students.stream()
                        .filter(s-> s.getMarks() < 87)
                        .findAny();                               // findAny
        System.out.println(find);

        boolean result =
                numbers.stream()
                        .anyMatch(n -> n > 50);            // anyMatch
        System.out.println(result);

        boolean match =
                students.stream()
                        .anyMatch(s-> s.getMarks() == 87);
        System.out.println(match);

        boolean all =
                students.stream()
                        .allMatch(s-> s.getMarks() >=40);  // allMatch
        System.out.println(all);

        boolean none =
                students.stream()                                 // noneMatch
                        .noneMatch(s-> s.getMarks() == 100);
        System.out.println(none);

        int sum =
                numbers.stream()
                        .reduce(0,(a,b)-> a+b);  // reduce
        System.out.println(sum);

        int sum2 =
                students.stream()
                        .map(Student::getMarks)
                        .reduce(0,Integer::sum);//sum
        System.out.println(sum2);

        numbers.stream()
                .peek(n-> System.out.println("before filter :"+n))     // peek
                .filter(n-> n > 20)
                .peek(n-> System.out.println("after filter :"+n))
                .map(n-> n*2)
                .toList();

        List<List<Integer>> nums = List.of(
                List.of(10,20),
                List.of(30,40),
                List.of(40,50)
        );
        System.out.println(nums);

        nums.stream()
                .flatMap(list-> list.stream())               // flatMap
               .forEach(System.out::println);

        List<Integer> list =
                nums.stream()
                        .flatMap(l->l.stream())
                        .filter(num -> num > 20)
                        .toList();
        System.out.println(list);

        List<Integer> result2 =
                numbers.stream()
                        .takeWhile(n -> n < 40)                 // takeWhile
                        .toList();
        System.out.println(result2);

        List<Integer> result3 =
        numbers.stream()
                .dropWhile(n-> n < 40)                        // dropWhile
                .toList();
        System.out.println(result3);






















    }
}
