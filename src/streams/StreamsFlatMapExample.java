package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import static java.util.stream.Collectors.*;

/**
 * FlatMap: Converts one type to another as Map, but for lists or arrays of elements
 */
public class StreamsFlatMapExample {

    public static List<String> printStudentActivities() {
        List<String> studentActivities = StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct()
                .sorted()
                .collect(toList());
        return studentActivities;
    }

    public static long getStudentActivitiesCount() {
         long numberOfStudentActivities = StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct() // Stream<String> -> with distinct function perform
                .count();
        return numberOfStudentActivities;
    }

    public static void main(String[] args) {
        System.out.println("printStudentActivities : " + printStudentActivities());
        System.out.println("getStudentActivitiesCount : " + getStudentActivitiesCount());
    }
}
