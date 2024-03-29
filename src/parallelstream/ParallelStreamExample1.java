package parallelstream;

import data.Student;
import data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class ParallelStreamExample1 {

    public static List<String> sequentialPrintStudentActivities() {
        long startTime = System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct()
                .sorted()
                .collect(toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in sequential : " + (endTime-startTime));
        return studentActivities;
    }

    public static List<String> parallelPrintStudentActivities() {
        long startTime = System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents().stream().parallel() //Stream<Student>
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct()
                .sorted()
                .collect(toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in parallel : " + (endTime-startTime));
        return studentActivities;
    }

    public static void main(String[] args) {
        sequentialPrintStudentActivities();
        parallelPrintStudentActivities();
    }
}
