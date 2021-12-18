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
                .collect(toList());
        return studentActivities;
    }

    public static void main(String[] args) {
        System.out.println("printStudentActivities : " + printStudentActivities());
    }
}
