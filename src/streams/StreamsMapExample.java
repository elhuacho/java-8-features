package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

/**
 * Map: Converts one type to another
 */
public class StreamsMapExample {


    public static List<String> nameList() {
        List<String> studentList = StudentDataBase.getAllStudents().stream() // Stream<Student>
                // Student as an input -> Student Name
                .map(Student::getName) // Stream<String>
                .map(String::toUpperCase) // Stream<String> -> uppercase operation on each input
                .collect(toList());
        return studentList;
    }

    public static Set<String> nameSet() {
        Set<String> studentList = StudentDataBase.getAllStudents().stream() // Stream<Student>
                // Student as an input -> Student Name
                .map(Student::getName) // Stream<String>
                .map(String::toUpperCase) // Stream<String> -> uppercase operation on each input
                .collect(toSet());
        return studentList;
    }

    public static void main(String[] args) {
        System.out.println(nameList());
        System.out.println(nameSet());
    }
}
