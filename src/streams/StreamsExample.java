package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        Predicate<Student> studentPredicate = (s) -> s.getGradeLevel()>=3;
        Predicate<Student> studentGpaPredicate = (s) -> s.getGpa()>=3.9;

        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents()
                .stream()
//                .parallelStream()
                .peek(student -> {
                    System.out.println(student);
                })
                .filter(studentPredicate)
                .peek(student -> {
                    System.out.println("after 1st filter : " + student);
                })
                .filter(studentGpaPredicate)
                .peek(student -> {
                    System.out.println("after 2nd filter : " + student);
                })
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println(studentMap);
    }
}
